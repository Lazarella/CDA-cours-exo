package com.m2ibank.service;

import com.m2ibank.config.jwt.JwtTokenProvider;
import com.m2ibank.model.Customer;
import com.m2ibank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements UserDetailsService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenProvider jwtProvider;

    @Lazy
    @Autowired
    private PasswordEncoder passwordEncoder;


    public boolean verifyUser(String email, String password) {
        return customerRepository.findByEmail(email)
                .map(customer -> passwordEncoder.matches(password,customer.getPassword()))
                .orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + email));
    }

    // Méthode pour vérifier si un nom d'utilisateur (email) existe déjà dans la base de données.
    public boolean checkUserNameExists(String email){
        return customerRepository.findByEmail(email).isPresent();
    }

    // Méthode pour générer un token JWT après avoir authentifié un utilisateur.
    public String generateToken(String email, String password){
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(email, password));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = tokenProvider.generateToken(authentication);
        return token;
    }

    // Méthode pour créer un nouvel utilisateur, avec le mot de passe chiffré, et le sauvegarder dans la base de données.
    public boolean createCustomer(Customer customer){
        customer.setPwd(passwordEncoder.encode(customer.getPassword()));
        customerRepository.save(customer);
        return true;
    }

    // Méthode pour charger les détails de l'utilisateur par son email. Utilisée par Spring Security pour l'authentification.
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return customerRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + email));
    }
}
