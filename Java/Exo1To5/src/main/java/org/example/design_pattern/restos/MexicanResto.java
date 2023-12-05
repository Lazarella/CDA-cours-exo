package org.example.design_pattern.restos;

public class MexicanResto extends Resto {

    @Override
    Ingredient createIngredient(){
        return new MexicanIngredient();
    }

    @Override
    CookUstensil createCookUstensil() {
        return new MexicanCookUstensil();
    }
    @Override
    Dish createDish(){
        return new MexicanDish();
    }
}
