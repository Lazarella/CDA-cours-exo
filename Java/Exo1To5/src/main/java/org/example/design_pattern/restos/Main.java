package org.example.design_pattern.restos;

public class Main {
    public static void main(String[] args) {
        JaponResto japonResto = new JaponResto();
        RestaurantForCostumer orderA = new RestaurantForCostumer.Builder()
                .japonResto(japonResto)
                .build();

        Dish dish = japonResto.createDish();
        dish.serve();
    }
}
