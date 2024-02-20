package com.example.tpblog.controller;

import com.example.tpblog.service.LoginService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/userarea")
@AllArgsConstructor
public class UserController {

    private LoginService loginService;

    @GetMapping("/login")
    public String getLogin(){
        return "form-login";
    }

    @PostMapping("/login")
    public String submitLogin(@RequestParam String loginentry, @RequestParam String passwordentry ){
        if (loginService.login(loginentry,passwordentry)){
            return "protected";
        }
        return "login";
    }
    }
}
