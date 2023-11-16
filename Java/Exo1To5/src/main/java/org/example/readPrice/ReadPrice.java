package org.example.readPrice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReadPrice {

    public static void getPrice() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n **** Exercice 2 ****\n");
        System.out.println("Veuillez renseigner le prix BRUT de l'article");
        double priceRow = scanner.nextDouble();

        System.out.println("Veuillez renseigner le taux de la TVA (en %)");
        double tva = scanner.nextDouble();

        double fullTva = tva/100 + 1;

        double fullPrice = priceRow * fullTva;

        System.out.println("Le prix de l'article est de "+Math.round(fullPrice)+" €");
        System.out.println("le montant de la TVA est de "+ priceRow*(tva/100)+" €" );





    }
}
