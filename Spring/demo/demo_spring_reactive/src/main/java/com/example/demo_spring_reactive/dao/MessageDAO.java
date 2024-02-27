package com.example.demo_spring_reactive.dao;

import com.example.demo_spring_reactive.Repository.MessageRepository;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.r2dbc.core.DatabaseClient;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Component
public class MessageDAO {

    private final ConnectionFactory connectionFactory;

    private final DatabaseClient databaseClient;
    private final MessageRepository messageRepository;

    public MessageDAO(ConnectionFactory connectionFactory,
                      MessageRepository messageRepository) {
        this.connectionFactory = connectionFactory;
        databaseClient = DatabaseClient.create(connectionFactory);

        Mono result = databaseClient
                .sql("CREATE TABLE IF NOT EXISTS message(id int primary key auto_increment, sender varchar(100), content varchar(100), message_date_time timestamp )")
                .then()
                .doOnSuccess((Void) -> {
                    System.out.println("Création de la table ok!");
                })
                .doOnError((Void) -> {
                    System.out.println("Echec de la création de la Table message ");
                });
        result.subscribe();
        this.messageRepository = messageRepository;
    }

    public Mono add(String sender, String content, LocalDateTime dateTime){
        Map<String,Object> values = new HashMap<>();
        values.put("sender", sender);
        values.put("content", content);
        values.put("messageDateTime", dateTime);
        Mono result = databaseClient.sql("INSERT INTO message(sender, content,message_date_time) values (:sender, :content, :messageDateTime )")
                .bindValues(values)
                .then();
        return result ;
    }
    public Mono delete(Integer id) {
        return databaseClient.sql("DELETE FROM message where id=:id").bind("id", id).then();
    }
    public Mono<Long> update(Integer id, String content) {
        return databaseClient
                .sql("UPDATE message set content = :content where id = :id")
                .bind("content", content).fetch().rowsUpdated();
    }

}
