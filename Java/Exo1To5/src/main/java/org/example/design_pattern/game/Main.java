package org.example.design_pattern.game;

import org.example.design_pattern.game.character.*;

public class Main {
    public static void main(String[] args) {
        KillerQueenOfDeath myGal = KillerQueenOfDeath.getInstance();
        DescriptionCharacter description = myGal.createDescription();
        description.presentation();

        CharacterFactory wiccanFactory = new Wiccan();

        NameCharacter name = wiccanFactory.createName();
        PvCharacter pvCharacter = wiccanFactory.createPvCharacter();
        Weapon weapon = wiccanFactory.getWeapon();
        LevelCharacter levelCharacter = wiccanFactory.createLevel();
        boolean isBeautiful = wiccanFactory.isBeautiful();
        DescriptionCharacter descriptionWiccan = wiccanFactory.createDescription();

        PlayerCharacter myPersona1 = new PlayerCharacter.Builder()
                .name(name)
                .pvCharacter(pvCharacter)
                .weapon(weapon)
                .levelCharacter(levelCharacter)
                .description(descriptionWiccan)
                .build();

        descriptionWiccan.presentation();

    }
}
