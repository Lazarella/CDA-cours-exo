package org.example.design_pattern.game.building;

public class University extends BuildFactory {

    @Override
    NameBuilding createName() {
        System.out.println("L'Université du Savoir");
        return null;
    }

    @Override
    PriceBuilding createPriceBuilding() {
        return null;
    }

    @Override
    PointValue int createGamerPoint() {
        return int point = 25;
    }

    @Override
    Type getType() {
        return null;
    }

    @Override
    levelBuilding level() {
        return null;
    }

    @Override
    boolean isBeautiful() {
        return false;
    }
}
