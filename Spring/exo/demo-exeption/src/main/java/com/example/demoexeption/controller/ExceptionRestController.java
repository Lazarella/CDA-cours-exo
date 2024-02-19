package com.example.demoexeption.controller;

import com.example.demoexeption.controller.exception.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

//@RestControllerAdvice
@ControllerAdvice
public class ExceptionRestController {
    @ExceptionHandler(ArithmeticException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handlerArithmeticException(ArithmeticException e){
        return "Oupsie! Il semblerait qu'on ai un problème de maths (signalé par ControllerAdvice)"+ e.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(CustomException.class)
    //@ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handlerCustomException(CustomException e){
        return "Oupsie, problème custom ~(>_<。)＼ (signalé par ControllerAdvice)";
    }
}
