package org.example.design_pattern.restos;

public abstract class Resto {
    abstract Ingredient createIngredient() ;
    abstract CookUstensil createCookUstensil();
    abstract Dish createDish();

}
