package org.example.design_pattern.restos;

public class RestoFrance {
    private Ingredient ingredient;
    private CookUstensil cookUstensil;
    private Dish dish;

    public RestoFrance(Resto model){
        ingredient = model.createIngredient();
        cookUstensil = model.createCookUstensil();
        dish = model.createDish();

    }
}
