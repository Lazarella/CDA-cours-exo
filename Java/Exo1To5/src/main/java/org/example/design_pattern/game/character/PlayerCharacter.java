package org.example.design_pattern.game.character;

public class PlayerCharacter {
    private final NameCharacter name;
    private PvCharacter pvCharacter;
    private Weapon weapon;
    private LevelCharacter levelCharacter;
    private boolean isBeautiful;
    private DescriptionCharacter description;

    private PlayerCharacter(Builder builder){
        this.name = builder.name;
        this.pvCharacter = builder.pvCharacter;
        this.weapon = builder.weapon;
        this.levelCharacter = builder.levelCharacter;
        this.description = builder.description;
    }
    public static class Builder{
        private NameCharacter name;
        private PvCharacter pvCharacter;
        private Weapon weapon;
        private LevelCharacter levelCharacter;
        private boolean isBeautiful;
        private DescriptionCharacter description;

        public Builder name(NameCharacter name){
            this.name = name;
            return this;
        }
         public Builder pvCharacter(PvCharacter pvCharacter){
            this.pvCharacter = pvCharacter;
            return this;
        }
         public Builder weapon(Weapon weapon){
            this.weapon  = weapon;
            return this;
        }

         public Builder levelCharacter(LevelCharacter levelCharacter){
            this.levelCharacter = levelCharacter;
            return this;
        }
         public Builder description(DescriptionCharacter description){
            this.description = description;
            return this;
        }

        public PlayerCharacter build() {
            return new PlayerCharacter(this);
        }

    }
}
