package com.example.exo_session.Loginservice;

import com.example.exo_session.model.User;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public User checkLogin(User userEntry) {
        if (userEntry.getLogin().equals("Deluxe") && userEntry.getUserPassword().equals("1234")) {
            userEntry.setLogged(true);
        } else {
            userEntry.setLogged(false);
        }
        return userEntry;
    }
}
