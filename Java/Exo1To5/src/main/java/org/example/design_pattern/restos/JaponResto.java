package org.example.design_pattern.restos;

public class JaponResto extends Resto {

    @Override
    Ingredient createIngredient(){return new JaponIngredient(); }

    @Override
    CookUstensil createCookUstensil() {
        return new JaponCookUstensil();
    }

    @Override
    Dish createDish() {
        return new JaponDish();
    }
}
