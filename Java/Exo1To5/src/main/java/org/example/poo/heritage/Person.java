package org.example.poo.heritage;

public class Person {
    public static int counter = 0;

    protected int id;

    protected String name;

    protected int age;

    {
        counter++;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void greets(){
        System.out.println("Hello");
    }
}
