package com.example.exercice_student.model;


import jakarta.annotation.Nonnull;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {

    private Long id;

    @NotNull
    @Size(min=3, max=50, message= "Format invalide, veuillez entrer un prénom normal")
    private String firstName;

    @NotBlank
    private String lastName;

    @Min(3)
    @Max(99)
    private Integer age;

    @Email(message="Format invalide! On ne va pas vous envoyer un pigeon voyageur quand même!")
    private String email;


}
