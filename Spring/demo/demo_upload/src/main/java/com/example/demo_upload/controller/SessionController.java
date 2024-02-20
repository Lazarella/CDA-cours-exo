package com.example.demo_upload.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/http-session")
public class SessionController {

    @Autowired
    private HttpSession _httpSession;

    @GetMapping("/ecrire")
public String write(){
        _httpSession.setAttribute("name", "Jeanne");
        return "ecrit";
    }

    @GetMapping("ecrire-liste")
    private String writeList(){
        List<String> stringList = Arrays.asList("titi", "tata", "toto");
        _httpSession.setAttribute("list",stringList);
        return "string list";
    }

    @GetMapping("/lire")
    public String read(){
        return _httpSession.getAttribute("name").toString();
    }

    @GetMapping("/lire-liste")
    public String readList(){
        return _httpSession.getAttribute("list").toString();
    }

    @GetMapping("supprimer")
    public String delete(){
        _httpSession.removeAttribute("name");
        return "suppression attribut name ok!!";
    }

}
