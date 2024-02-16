package com.example.demo_validation.model;

import com.example.demo_validation.validation.MyValid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Contact {
    @Size(min=3, max=50,message = "Prénom normal requis!")
    private String firstName;

    @NotNull
    @NotBlank
    @MyValid(value="ta", message="On avait dit Tata!!!")
    private String lastName;

    @Min(3)
    @Max(42)
    private Integer age;
}
