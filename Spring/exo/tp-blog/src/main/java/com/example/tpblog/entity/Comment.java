package com.example.tpblog.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Comment {
    private UUID id;

    @NotBlank
    @Size(min=3, max=150)
    private String name;

    @Email
    private String mail;

    @NotBlank
    @Size(min=5, max=255)
    private String content;
}
