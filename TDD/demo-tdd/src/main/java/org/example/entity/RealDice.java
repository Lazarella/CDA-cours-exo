package org.example.entity;

import java.util.Random;

public class RealDice implements Dice{

    private Random random;

    public RealDice() {
        random = new Random();
    }
    public  int getValue() {
        return random.nextInt(1,7);
    }
}
