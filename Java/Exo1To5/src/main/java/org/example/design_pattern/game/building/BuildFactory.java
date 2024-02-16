package org.example.design_pattern.game.building;

public abstract class BuildFactory {

    abstract NameBuilding createName();
    abstract PriceBuilding createPriceBuilding();
    abstract  PointValue createGamerPoint();
    abstract Type getType();
    abstract LevelBuilding level();
    abstract  boolean isBeautiful();
}
