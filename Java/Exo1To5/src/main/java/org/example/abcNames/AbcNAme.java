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

        char char1 = name.charAt(0);
        char char2 = name.charAt(0);
        char char3 = name.charAt(0);
    }
}
