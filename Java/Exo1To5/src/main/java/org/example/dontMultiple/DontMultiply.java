package org.example.dontMultiple;

import java.util.Scanner;

public class DontMultiply {

    public static void getTheTruthOfMultiplication() {

        System.out.println("\n**** Exercice 4 ****\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer un nombre");
        Double nbUser1 = scanner.nextDouble();

        System.out.println("Veuillez entrer un autre nombre");
        Double nbUser2 = scanner.nextDouble();

        if (nbUser1<0 && nbUser2<0){

            System.out.println("Le produit des deux nombre est positif");

        }else if (nbUser1<0 && nbUser2<0){
            System.out.println("Le produit des deux nombre est positif");
        } else if (nbUser1<0 ^ nbUser2<0) {
            System.out.println("Le produit des deux nombre est négatif");

        }else if(nbUser1==0 || nbUser2 ==0 ){
            return;
        }


    }
}
