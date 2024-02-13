package com.example.demo_spring.model;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class Cat {
    private UUID id;
    private String name;
    private String breed;

}
