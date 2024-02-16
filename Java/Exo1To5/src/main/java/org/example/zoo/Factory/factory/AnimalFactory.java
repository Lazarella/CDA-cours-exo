package org.example.zoo.Factory.factory;

import org.example.zoo.Factory.Entity.Animal;
import org.example.zoo.Factory.builder.AnimalBuilder;

public abstract class AnimalFactory {
    abstract Animal createAnimal(AnimalBuilder builder);
}
