package com.example.tpblog.service;

import com.example.tpblog.Repository.UserRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private HttpSession _httpSession;
    @Autowired
    private UserRepository userRepository;

    private UserService userService;

    public boolean login(String login,String password){
        if(userService.findUserbyAlias(login) && userService.findUserbyPassword(password)){
            _httpSession.setAttribute("login","OK");
            return true;
        }
        return false;
    }
}
