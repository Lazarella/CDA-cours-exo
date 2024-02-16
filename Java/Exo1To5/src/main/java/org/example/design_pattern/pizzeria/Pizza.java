package org.example.design_pattern.pizzeria;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private TailleDePizza tailleDePizza;
    private Pate pate;
    private Sauce sauce;
    private List<Fromage> fromage;
    private List<Garniture> garniture;

    private Pizza(Builder builder) {
        this.tailleDePizza = builder.tailleDePizza;
        this.pate = builder.pate;
        this.sauce = builder.sauce;
        this.fromage = builder.fromage;
        this.garniture = builder.garniture;

    }

    public static class Builder {
        private TailleDePizza tailleDePizza;
        private Pate pate;
        private Sauce sauce;
        private List<Fromage> fromage = new ArrayList<>();
        private List<Garniture> garniture = new ArrayList<>();


        public Builder tailleDePizza(TailleDePizza tailleDePizza) {
            this.tailleDePizza = tailleDePizza;
            return this;
        }

        public Builder pate(Pate pate) {
            this.pate = pate;
            return this;
        }

        public Builder sauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

//        public Builder fromage(List<Fromage> fromage) {
//            this.fromage = fromage;
//            return this;
//        }

//        public Builder garniture(List<Garniture> garniture) {
//            this.garniture = garniture;
//            return this;
//        }
        public Pizza build(){return new Pizza(this);}

    }
    public Pizza fromage(Fromage fromage) {
        this.fromage.add(fromage);
        return this;
    }
    public Pizza garniture(Garniture garniture) {
        this.garniture.add(garniture);
        return this;
    }

    @Override
    public String toString() {
        return "Votre Pizza " +
                "taille de la pizza :" + tailleDePizza +
                ", type de pate :" + pate +
                ", sauce :" + sauce +
                ", fromage :" + fromage +
                ", garniture :" + garniture +
                '.';
    }
}

