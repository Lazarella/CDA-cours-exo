package org.example.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {

        String str = "b";

        try {
            int result = Integer.parseInt(str); 
            System.out.println("Résultat : " + result);
        } catch (NumberFormatException e){
            System.out.println("Vous n'avez pas entré un nombre!!!");
        }
        //Exercice 1

        int i = 3;
        int j = 0;

        try {
            System.out.println("résultat = " + (i / j));
        } catch (ArithmeticException e) {
            System.out.println("Message : ");
            System.out.println(e.getMessage());
        }
        //Exercice 3

        int []tab = {1,2,3,4,5};
        int iteration = 5;

        try{
            System.out.println(tab[iteration]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Message : ");
            System.out.println(e.getMessage());
        }

        //Exercice 4

        Compte myCompte = new Compte(6000.90f);
        float montant = 7000f;

        myCompte.verser(montant);

        try {
            myCompte.retirer(montant);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
