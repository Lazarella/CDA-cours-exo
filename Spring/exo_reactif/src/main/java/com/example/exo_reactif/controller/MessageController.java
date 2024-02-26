package com.example.exo_reactif.controller;

import com.example.exo_reactif.entity.Message;
import com.example.exo_reactif.service.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/blabla")
public class MessageController {

    private final MessageService messageService;


    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

@GetMapping
    public String displayChat(Model model){
        return "chat-room";
}
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("recipe", new Message());
        return "chat-room";
    }
    @PostMapping("/add")
    public String submitMessage(Message message) {
        messageService.sendMessage(message.getContent());
        return "chat-room";
    }

}
