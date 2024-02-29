package com.example.crypto_market.dto;

import jakarta.validation.constraints.Email;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.crypto_market.entity.User}
 */
@Value
public class UserDTO implements Serializable {
    String UserAlias;
    String userPassword;
    @Email
    String mail;
}