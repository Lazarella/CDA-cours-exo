package org.example.poo.heritage;

public class Teacher extends Person {

private String Subject;
    public Teacher(String name, int age) {
        super(name, age);
    }

    public void  explain(){
        System.out.println("Explanation begins");
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }
}
