package com.example.exo_reactif.service;

import com.example.exo_reactif.entity.Message;
import com.example.exo_reactif.entity.User;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

@Service
public class MessageService {
    private final Sinks.Many<Message> sink;

    public MessageService() {
        sink = Sinks.many().multicast().onBackpressureBuffer();
    }
    public void sendMessage(String content, User user) {
        sink.tryEmitNext(Message.builder().content(content).user(user).build());
    }
    public Flux<Message> getFlux(){
        return sink.asFlux();
    }
}
