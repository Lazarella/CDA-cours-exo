package org.example.design_pattern.game.character;

public abstract class CharacterFactory {
    public abstract NameCharacter createName();
    public abstract PvCharacter createPvCharacter();
    public abstract Weapon getWeapon();
    public abstract LevelCharacter createLevel();
    public abstract boolean isBeautiful();
    public abstract DescriptionCharacter createDescription();
}
