package org.example.design_pattern.game.building;

public class University extends BuildFactory {

    @Override
    NameBuilding createName() {
        System.out.println("L'Université du Savoir");
        return new UniversityName();
    }

    @Override
    PriceBuilding createPriceBuilding() {

        return new UniversityPrice();
    }

    @Override
    PointValue createGamerPoint() {
        return new UniversityValue() ; }

    @Override
    Type getType() {

        return null;
    }

    @Override
    LevelBuilding level() {

        return new UniversityLevel();
    }

    @Override
    boolean isBeautiful() {
        return false;
    }
}
