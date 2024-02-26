package com.example.exo_reactif.controller;

import com.example.exo_reactif.service.MessageService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("chat")
public class MessageRestController {
    private final MessageService messageService;

    public MessageRestController(MessageService messageService) {
        this.messageService = messageService;
    }
    @GetMapping("/add/{message}")
    public ResponseEntity<String> addMessage(@PathVariable("message") String message){
        this.messageService.sendMessage(message);
        return  ResponseEntity.ok("OK!");
    }
    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> get(){
        return messageService.getFlux();
    }
}
