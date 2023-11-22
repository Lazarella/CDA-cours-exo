package org.example.poo.heritage;

public class PersonHouse {

    protected String name;

    protected House house;

    public PersonHouse(String name, House house) {
        this.name = name;
        this.house = house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public void display(){
        System.out.println("Je m'appelle "+ name+".");
        house.display();
    }
}
