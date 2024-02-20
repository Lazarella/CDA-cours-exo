package com.example.exo_session.Controller;

import com.example.exo_session.Loginservice.LoginService;
import com.example.exo_session.model.User;
import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/http-session")
public class SessionController {

@Autowired
    private HttpSession _httpSession;

    private LoginService loginService;

    @GetMapping("/form")
        public String getForm(){
            return "form";
        }

    @GetMapping("/signin")
    private String signIn(@RequestParam("login") String login, @RequestParam("password") String password, HttpSession session) {
        String loginUser = _httpSession.getAttribute("login").toString();
        String passwordUser = _httpSession.getAttribute("password").toString();
        User userEntry = User.builder()
                .login(login)
                .userPassword(password)
                .build();
        loginService.checkLogin(userEntry);
        if (userEntry.isLogged()) {
            return "redirect: /protectedPlace";
        } else {
            return "redirect: /http-session/cki";
        }

    }

    @GetMapping("/cki")
    public String showErrorPage(){
        return "error-page";
    }
}
