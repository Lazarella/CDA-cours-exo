package com.example.demo_spring_reactive.service;

import com.example.demo_spring_reactive.Repository.MessageRepository;
import com.example.demo_spring_reactive.dao.MessageDAO;
import com.example.demo_spring_reactive.model.Message;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

import java.time.LocalDateTime;

@Service
public class MessageService {

    private final Sinks.Many<Message> sink;
    private final MessageDAO messageDAO;
    private final MessageRepository messageRepository;

    public MessageService( MessageDAO messageDAO,
                           MessageRepository messageRepository) {
        sink = Sinks.many().multicast().onBackpressureBuffer();
        this.messageDAO = messageDAO;
        this.messageRepository = messageRepository;
    }

    public void sendMessage(String sender, String content) {
        LocalDateTime now = LocalDateTime.now();
        sink.tryEmitNext(Message.builder().content(content).sender(sender).messageDateTime(now).build());
        messageDAO.add(sender, content, now).subscribe();
    }

    public Flux<Message> getFlux() {
        messageRepository.findAll();
        return sink.asFlux();
    }
}
