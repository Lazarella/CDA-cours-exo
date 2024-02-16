package org.example.design_pattern.game.character;

public enum KQoD_Weapon {
    ULTIMATE_SWORD_OF_DOOM(200, true),
    APOCALYPSE_NOW(300, false),
    EDGE_STORM(300, false);

    private final int score;
    private final boolean isBeautiful;

    KQoD_Weapon(int score, boolean isBeautiful){
        this.score = score;
        this.isBeautiful = isBeautiful;
    }

    public int getScore() {
        return score;
    }

    public boolean isBeautiful() {
        return isBeautiful;
    }
}
