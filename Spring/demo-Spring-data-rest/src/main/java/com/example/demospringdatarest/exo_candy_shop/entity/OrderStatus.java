package com.example.demospringdatarest.exo_candy_shop.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum OrderStatus {
    New,
    In_Progress,
    Done;
}
