package com.example.correction_spring_aspect.dto;

import lombok.Value;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link com.example.correction_spring_aspect.entity.Author}
 */
@Value
public class AuthorDto implements Serializable {
    String firstName;
    String lastName;
    List<BookDTO> bookList;
}