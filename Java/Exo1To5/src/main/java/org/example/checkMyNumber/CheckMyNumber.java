package org.example.checkMyNumber;

import java.util.Scanner;

public class CheckMyNumber {

    public static void getTheTruthOfMyNumber() {

        System.out.println("\n**** Exercice 3 ****");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrez un nombre");
        Double nbUser = scanner.nextDouble();

        if(nbUser>0){
            System.out.println("Votre nombre est positif, félicitations!");
        }else if (nbUser<0){
            System.out.println("Votre nombre est négatif, félicitations!");
        } else {
            return;
        }

    }
}
