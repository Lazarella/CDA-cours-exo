package com.example.exospring.controller;

import com.example.exospring.model.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TodoController {

    @RequestMapping(value ="/")
    public String home(){
        return "home";
    }

    @RequestMapping(value = "/todo_display")
    public String showTodo(Model model){
        Todo todo1 = new Todo("test1", "Faire du code", false);
//        Todo todo2 = new Todo("test2", "Acheter des croquettes pour Satan", true);
//        Todo todo3 = new Todo("test3", "Finir le gai savoir", false);
//        List<Todo> todo = List.of(todo1, todo2, todo3);
        model.addAttribute("name", todo1.getName());
        model.addAttribute("description","Faire du code");
        model.addAttribute("done", todo1.getDone());

        return "todo_display";
    }
}
