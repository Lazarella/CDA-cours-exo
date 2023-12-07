package org.example.zoo.Factory.factory;

import org.example.zoo.Factory.Entity.Animal;
import org.example.zoo.Factory.builder.AnimalBuilder;

public class PanteraFactory extends AnimalFactory {
    @Override
    public Animal createAnimal(AnimalBuilder builder) {
        return builder.build();
    }
}
