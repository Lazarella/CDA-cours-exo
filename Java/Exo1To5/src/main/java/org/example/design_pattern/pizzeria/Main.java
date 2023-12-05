package org.example.design_pattern.pizzeria;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pizza pizzaA = new Pizza.Builder()
                .tailleDePizza(TailleDePizza.GRANDE)
                .pate(Pate.CLASSIQUE)
                .sauce(Sauce.BARBECUE)
                .fromage(Collections.singletonList(Fromage.CHEDDAR))
                .garniture(Collections.singletonList(Garniture.PEPPERONI))
                .garniture(Collections.singletonList(Garniture.POIVRON))
                .build();
        System.out.println(pizzaA);
    }
}
