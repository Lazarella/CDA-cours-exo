package com.example.demoexeption.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

public class DemoController {

    @GetMapping("/salut")
    public String handleError(Model model) {
        Integer error = 25/0;
        return "salut";
    }

    @ExceptionHandler(ArithmeticException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
        public String handlerArithmeticException(Model model, ArithmeticException e){
            model.addAttribute("errorMessage", e.getMessage());
                                  return "oups";
        }

}
