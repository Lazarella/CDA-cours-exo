package com.example.exospring.controller;

import com.example.exospring.model.Todo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/home")
public class TodoRestController {

    @GetMapping("/todos")
    public List<Todo> getAllTodos(){
        Todo todo1 = new Todo("test1", "Faire du code", false);
        Todo todo2 = new Todo("test2", "Acheter des croquettes pour Satan", true);
        Todo todo3 = new Todo("test3", "Finir le gai savoir", false);
        return List.of(todo1, todo2, todo3);
    }

    @GetMapping("todo")
    public Todo getTodo(){
        return new Todo("test4", "Brûler des trucs", true);
    }
}
