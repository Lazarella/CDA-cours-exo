package com.example.demoexeption.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "problème 2")
public class SecondCustomException extends RuntimeException{
    public SecondCustomException(String message){
        super(message);
    }
}
