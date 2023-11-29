package org.example.paper_shop;

public class Main {
    public static void main(String[] args) {

        Line [] userLine = new Line[10];
        userLine [0] = new Line(11, 3);
        userLine [1] = new Line(2, 4);
        userLine [2] = new Line(21, 2);

        Bill userBill = new Bill("Jean Jean",userLine, "29/11/2023");

        System.out.println(userBill);
        
    }
}
