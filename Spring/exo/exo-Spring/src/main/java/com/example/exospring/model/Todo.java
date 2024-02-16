package com.example.exospring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
    private String name;
    private String description;
    private Boolean isDone;
}
