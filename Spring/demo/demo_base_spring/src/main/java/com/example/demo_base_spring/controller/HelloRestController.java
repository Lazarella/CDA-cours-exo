package com.example.demo_base_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/home")
public class HelloRestController {


    //@RequestMapping(method = RequestMethod.GET) fait la même chose que @GetMapping
    @GetMapping// à défaut c'est root
    public String sayHello(){
        System.out.println("Hello World!");
        return "(｡･∀･)ﾉﾞ Hello World o(*￣▽￣*)ブ";
    }

    @GetMapping(value = "persons")
    public List<String> sayCoucouJson(){

        return List.of("Toto Gros", "Martin Pokegros", "Sarah Connor");
    }
}
