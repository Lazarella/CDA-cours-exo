package com.example.demoexeption.controller;

import com.example.demoexeption.controller.exception.CustomException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondRestController {

    @GetMapping("/bye")
    public String hello(){
        Integer error = 25/0;
        return "Bye !!!";
    }
    @GetMapping("/byebye")
    public String bybye(){
        //if(true){
        throw new CustomException("Oupsie ~(>_<。)＼");
        //}
        //return "Bye bye world!!!";
    } @GetMapping("/hellothere")
    public String hellothere(){
        //if(true){
        throw new CustomException("OUPSIE!!! ~(>_<。)＼");
        //}
        //return "Bye bye world!!!";
    }
}
