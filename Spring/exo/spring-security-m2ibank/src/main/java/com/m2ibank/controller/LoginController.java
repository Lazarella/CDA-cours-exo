package com.m2ibank.controller;

import com.m2ibank.dto.BaseResponseDto;
import com.m2ibank.dto.CustomerLoginDto;
import com.m2ibank.model.Customer;
import com.m2ibank.repository.CustomerRepository;
import com.m2ibank.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api")
public class LoginController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/auth/register")
    public BaseResponseDto registerCustomer(@RequestBody Customer customer){
        if(customerService.cre(customer)){
            return new BaseResponseDto("success");
        }else{
            return new BaseResponseDto("Registration failed");
        }
    }

    @PostMapping("/auth/register/login")
    public BaseResponseDto loginCustomer(@RequestBody CustomerLoginDto customerLoginDto){
        if(customerService.checkUserNameExists(customerLoginDto.getEmail())){
            if(customerService.verifyUser(customerLoginDto.getEmail(), customerLoginDto.getPassword())){
                Map<String, Object> data = new HashMap<>();
                data.put("token", customerService.generateToken(customerLoginDto.getEmail(), customerLoginDto.getPassword()));
                        return new BaseResponseDto("login success");
            }else{
                return new BaseResponseDto("login failed");
            }
        }else{
            return new BaseResponseDto("This customer doesn't exist");
        }
    }


}
