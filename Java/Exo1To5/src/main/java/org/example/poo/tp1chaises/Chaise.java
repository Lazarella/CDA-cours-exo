package org.example.poo.tp1chaises;

public class Chaise {

    protected int id;
    public static int counter =0;

    protected String material;
    protected int feet;
    protected String color;

    {
        counter ++;
    }

    public Chaise( String material, int feet, String color) {
        this.id = counter;
        this.material = material;
        this.feet = feet;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public int getFeet() {
        return feet;
    }

    public String getColor() {
        return color;
    }

}
