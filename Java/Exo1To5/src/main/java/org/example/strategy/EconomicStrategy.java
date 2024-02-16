package org.example.strategy;

import java.util.Random;

public class EconomicStrategy implements NavigationStrategy{
    private Random random = new Random();
    @Override
    public boolean navigate(String entry) {
        System.out.println("Vous avez choisi la solution Economique!");
        return random.nextBoolean();
    }
}
