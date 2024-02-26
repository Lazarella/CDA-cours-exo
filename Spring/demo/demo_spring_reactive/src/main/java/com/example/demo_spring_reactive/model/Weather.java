package com.example.demo_spring_reactive.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Weather {
    private String date;
    private String city;
    private Float temperature;
    private String comment;
}
