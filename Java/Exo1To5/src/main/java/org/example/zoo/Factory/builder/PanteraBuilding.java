package org.example.zoo.Factory.builder;

public class PanteraBuilding extends AnimalBuilder{

    private String nickname;
    private boolean hasATasteForHumanFlesh;
    private PanteraColor panteraColor;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public AnimalBuilder zoologicClass(ZoologicClass zoologicClass) {
        return null;
    }

    @Override
    public AnimalBuilder name(String name) {
        return null;
    }

    @Override
    public AnimalBuilder age(int age) {
        return null;
    }

    @Override
    public AnimalBuilder gender(Gender gender) {
        return null;
    }

    @Override
    public AnimalBuilder eatingHabit(EatingHabit eatingHabit) {
        return null;
    }

    @Override
    public AnimalBuilder origin(String origin) {
        return null;
    }

}
