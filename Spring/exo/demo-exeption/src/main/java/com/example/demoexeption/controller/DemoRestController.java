package com.example.demoexeption.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    @GetMapping("/hello")
    public String hello(){
        Integer error = 25/0;
        return "hello world !!!";
    }

    @ExceptionHandler(ArithmeticException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handlerArithmeticException(ArithmeticException e){
        return "Oupsie! Il semblerait qu'on ai un problème de maths "+ e.getMessage();
    }
}
