package org.example.design_pattern.game.character;

public class Wiccan extends CharacterFactory{

    @Override
    public NameCharacter createName() {
        return new WiccanName();
    }

    @Override
    public PvCharacter createPvCharacter() {
        return new WiccanPV();
    }

    @Override
    public Weapon getWeapon() {
        return null;
    }

    @Override
    public LevelCharacter createLevel() {
        return new WiccanLevel();
    }

    @Override
    public boolean isBeautiful() {
        return false;
    }

    @Override
    public DescriptionCharacter createDescription() {
        return new WiccanDescription();
    }
}
