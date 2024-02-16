package org.example.exo2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exo2 {

    public static Scanner scanner = new Scanner(System.in);

    public static void AskNumber() {

        System.out.println("\n**** Exercice 3.4 ****");

        System.out.println("Veuillez entrez un nombre");
        double nbUser = scanner.nextDouble();

        if (nbUser > 0) {
            System.out.println("Votre nombre est positif, félicitations!");
        } else if (nbUser < 0) {
            System.out.println("Votre nombre est négatif, félicitations!");
        } else {
            System.out.println("Votre nombre est zéro petit coquin!");
        }

    }

    public static void AskAge() {

        System.out.println("Veuillez renseigner l'âge de votre enfant");

        int age = scanner.nextInt();

        if (age > 5 && age < 8) {
            System.out.println("Votre enfant est dans la catégorie Poussin");
        } else if (age > 6 && age < 10) {
            System.out.println("Votre enfant est dans la catégorie Pupille");

        } else if (age > 9 && age < 12) {
            System.out.println("Votre enfant est dans la catégorie Minime");

        } else if (age > 12 && age < 17) {
            System.out.println("Votre enfant est dans la catégorie cadet");

        } else {
            System.out.println("Votre enfant n'a pas l'âge requis");

        }

    }

    public static void CheckDivisible() {

        System.out.println("Veuillez entrer un nombre");

        float nbUser = scanner.nextFloat();

        if (nbUser%3==0){
            System.out.println("Votre nombre est un divisible par 3");
        }else {
            System.out.println("Votre nombre n'est pas divisible par 3");
        }

    }

    public static void getPrice() {

        System.out.println("Combien de copie souhaitez vous?");

        int nbCopy = scanner.nextInt();

        if (nbCopy <11 ){
            System.out.println("Vous devez payer "+ 0.15* nbCopy+ " €");
        }
        else if (nbCopy <21 ){
            System.out.println("Vous devez payer "+ 0.10* nbCopy+ " €");
        }
        else{
            System.out.println("Vous devez payer "+ 0.5* nbCopy+ " €");
        }

    }


}
