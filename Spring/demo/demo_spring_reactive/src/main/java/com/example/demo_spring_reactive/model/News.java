package com.example.demo_spring_reactive.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class News {
    private String date;
    private String title;
    private String content;
    private String publisher;
}
