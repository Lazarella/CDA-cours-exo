package org.example.strategy;

import java.util.Random;

public class OffRoadStrategy implements NavigationStrategy {
    private Random random = new Random();
    @Override
    public boolean navigate(String entry) {
        System.out.println("Vous avez choisi la solution OffRoad!");
        return random.nextBoolean();
    }
}
