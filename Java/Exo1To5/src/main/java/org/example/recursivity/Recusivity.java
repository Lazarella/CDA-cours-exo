package org.example.recursivity;

import java.util.Scanner;

public class Recusivity {

    public static void ex_1(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("***** Les fonctions Récursives *****\n");
        System.out.println("***** La Factorielle *****");

        System.out.println("Entrer le nombre dont vous souhaitez connître la factorielle");
        int factoToGet = scanner.nextInt();

         Long resultFacto = getFacto(factoToGet);
    }

    public static Long getFacto(int nb) {

        if (nb == 0) {
            return 1L;
        }
        return nb * getFacto(nb-1);
    }
}
