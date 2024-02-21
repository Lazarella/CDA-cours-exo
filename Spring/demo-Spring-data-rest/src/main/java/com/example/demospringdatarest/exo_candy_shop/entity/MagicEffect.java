package com.example.demospringdatarest.exo_candy_shop.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.Entity;

//@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum MagicEffect {
    Fire_Ball,
    Fly,
    Changing_Size,
    Become_An_Animal,
    INVISIBILITY,
    Talk_To_Cloud;
}
