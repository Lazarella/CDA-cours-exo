package org.example.askName;

import java.util.Scanner;

public class AskName {

    public static void SayMyName() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("**** Exercice 1 ****\n");

        System.out.println("Quel est votre prénom?");
        String name = scanner.next();
        System.out.println("Bonjour "+name+" !");

    }

}
