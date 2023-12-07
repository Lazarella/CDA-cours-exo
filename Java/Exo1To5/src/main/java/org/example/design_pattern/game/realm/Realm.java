package org.example.design_pattern.game.realm;

import org.example.design_pattern.game.building.PlayerBuildings;
import org.example.design_pattern.game.character.PlayerCharacter;

import java.util.ArrayList;
import java.util.List;

public class Realm {
    private static volatile Realm instance = null;
    private static final Object lock = new Object();

    public static Realm getInstance() {
        if (instance == null) {
            synchronized (lock) {
                instance = new Realm();
            }
        }
        return instance;
    }

    private String name;
    private String playerName;
    private List<PlayerCharacter> realmCharacters = new ArrayList<>();
    private List<PlayerBuildings> realmBuildings = new ArrayList<>();

    //Tokens
    private int villager;
    private int buildingValue;
    private int charactersPoint;
    private int realmLevel;
    private int beautyScore;

    private Realm() {
        this.name = name;
        this.playerName = playerName;
        this.realmCharacters = realmCharacters;
        this.realmBuildings = realmBuildings;
        this.buildingValue = buildingValue;
        this.charactersPoint = charactersPoint;
        this.realmLevel = realmLevel;
        this.beautyScore = beautyScore;
    }
}
