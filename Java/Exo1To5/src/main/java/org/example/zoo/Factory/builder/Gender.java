package org.example.zoo.Factory.builder;

public enum Gender {
    MALE(false),
    FEMALE(false);

    private boolean isPregnant;
    Gender(boolean isPregnant) {
        this.isPregnant = isPregnant;
    }

    public boolean isPregnant() {
        return isPregnant;
    }

    public void setPregnant(boolean isPregnant) {
        if (this == FEMALE) {
            this.isPregnant = isPregnant;
        } else {
            this.isPregnant = false;
        }
        }
}
