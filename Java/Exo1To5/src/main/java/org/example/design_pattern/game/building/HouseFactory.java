package org.example.design_pattern.game.building;

import org.example.design_pattern.pizzeria.Garniture;

import java.sql.SQLOutput;

public class HouseFactory extends BuildFactory {

    private int villagers ;

    public int getVillagers() {
        return villagers;
    }

    @Override
    NameBuilding createName() {
        return new HouseName();
    }

    @Override
    PriceBuilding createPriceBuilding() {
        return new HousePrice();
    }

    @Override
    PointValue createGamerPoint() {
        return new HousePoint();
    }

    @Override
    Type getType() {
        System.out.println("La maison est a tout le monde");
        return null;
    }

    @Override
    levelBuilding level() {
        return new HouseLevel();
    }

    @Override
    boolean isBeautiful() {
        return true;
    }
}
