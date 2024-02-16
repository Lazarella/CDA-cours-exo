package org.example.poo.heritage;

public class Student extends Person {

    public Student(String name, int age) {
        super(name, age);
    }

    public void  goToClass(){
        System.out.println("I'm going to class");
    }
    public void displayAge(){
       System.out.println("My age is : "+age+" years old");
    }
}
