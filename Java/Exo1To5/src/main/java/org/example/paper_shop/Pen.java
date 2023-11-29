package org.example.paper_shop;

public class Pen extends Item{

    private String color;

    public Pen(String name, double price, String color) {
        super( "Stylo", price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Pen" +
                "color='" + color + '\'' +
                '.';
    }
}
