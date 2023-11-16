package org.example.abcNames;

import java.util.Scanner;

public class AbcNAme {

    public static void checkMyAbc() {

        System.out.println("\n**** Exercice 5 ****\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer un nom");
        String name = scanner.next();
        System.out.println("Veuillez entrer un deuxième nom");
        String name2 = scanner.next();
        System.out.println("Veuillez entrer un troisième nom");
        String name3 = scanner.next();

        if (name.toLowerCase().compareTo(name2)>0){

        }
    }
}
