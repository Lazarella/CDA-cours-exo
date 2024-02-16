package org.example.exercice5.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    private int quality;
    private int sellIn;
    private String name;
    private String type;

}