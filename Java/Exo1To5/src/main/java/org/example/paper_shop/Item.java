package org.example.paper_shop;

import java.util.Set;

public abstract class Item {
    private String name;
    private double price;
    private Integer ref;

    private static Integer counter = 30;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        this.ref = counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getRef() {
        return ref;
    }


    @Override
    public String toString() {
        return "Item" +
                "reférence :" + ref +
                ", Nom :'" + name + '\'' +
                ", Prix : " + price +
                '}';
    }
}
