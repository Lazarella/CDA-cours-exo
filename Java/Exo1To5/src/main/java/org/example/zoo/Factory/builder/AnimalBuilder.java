package org.example.zoo.Factory.builder;

import org.example.zoo.Factory.Entity.Animal;

public abstract class AnimalBuilder {
    public abstract AnimalBuilder zoologicClass(ZoologicClass zoologicClass);

    public abstract AnimalBuilder name(String name);

    public abstract AnimalBuilder age(int age);

    public abstract AnimalBuilder gender(Gender gender);

    public abstract AnimalBuilder eatingHabit(EatingHabit eatingHabit);

    public abstract AnimalBuilder origin(String origin);

    public Animal build() {
        return null;
    }
}
