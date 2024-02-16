package org.example.exercice3.entity;

public class Year {



    public Year() {
    }


    public boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        }
        return (year % 100 != 0) || (year % 400 == 0);
    }
}
