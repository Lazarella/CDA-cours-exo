package org.example.paper_shop;

import org.w3c.dom.ls.LSOutput;

public class Line {
    private Item item;
    private DataBase database;
    private int quantity;
    private double fullPrice = calculateFullPrice();
    private Integer ref;

    public Line(Integer ref, int quantity) {
        this.ref = ref;
        this.quantity = quantity;
        //this.fullPrice = fullPrice;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getFullPrice() {
        return fullPrice;
    }

    public double calculateFullPrice() {
        if (item != null) {
            return item.getPrice() * quantity;
        }
        return 0;
    }

    public void displayLine() {
        System.out.println("\n....." + quantity + "\n....." + database.containsKey(ref) + "\n....." + item.getName() + "\n....." + item.getPrice() + "€" + "\n....." + getFullPrice());
    }

    public Item getItem(Integer ref) {
            if (database.containsKey(ref)) {
                return database.getItem(ref);
            }
                return null;
            }

    @Override
    public String toString() {
        return "Line{" +
                "item=" + item +
                ", database=" + database +
                ", quantity=" + quantity +
                ", fullPrice=" + fullPrice +
                ", ref=" + ref +
                '}';
    }
}


