package org.example.paper_shop;

public class Paper extends Item{

    private int weight;

    public Paper(String name, double price, int weight) {
        super("Ramette", price);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Papier" +
                "Grammage :" + weight +
                '.';
    }
}
