package com.example.demo_base_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloController {

    @RequestMapping (value = "/")
    public String sayHello(){
        System.out.println("Kikou, c'est le passé!");
        return "hello";
    }

    @RequestMapping(value = "coucou")
    @ResponseBody
    public List<String> getPersons(){
        return List.of("Salvador Dali, André Malraux, Annette Messager");
    }

    @RequestMapping (value = "toto")
public String showToto(){
        return "toto";
    }

    @RequestMapping("home/person")
    public String personName(Model model){
        model.addAttribute("firstName", "Sarah");
        model.addAttribute("lastName", "CONNOR");

        List<String> personne = List.of("Ridley Scott", "John Brown");
        //List<String> personne = List.of();
        model.addAttribute("persons", personne);

        return "person/details";
    }
}
