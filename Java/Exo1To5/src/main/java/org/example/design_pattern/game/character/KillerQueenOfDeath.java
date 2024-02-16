package org.example.design_pattern.game.character;

public class KillerQueenOfDeath extends CharacterFactory{

    private static volatile KillerQueenOfDeath instance = null;
    private static final Object lock = new Object();
    public static KillerQueenOfDeath getInstance() {
        if(instance == null) {
            synchronized (lock) {
                instance = new KillerQueenOfDeath();
            }
        }
        return instance;
    }
    private KQoD_Weapon weapon;

    public void setWeapon(KQoD_Weapon newWeapon) {
        this.weapon = newWeapon;
    }
    @Override
    public NameCharacter createName() {
        return new KQODName();
    }

    @Override
    public PvCharacter createPvCharacter() {
        return new KQODPV();
    }

    @Override
    public Weapon getWeapon() {
        Weapon Weapon = null;
        return  null;
    }

    @Override
    public LevelCharacter createLevel() {
        return new KQODLevel();
    }

    @Override
    public boolean isBeautiful() {
        return true;
    }

    @Override
    public DescriptionCharacter createDescription() {
        return new KQODDescription();
    }
}
