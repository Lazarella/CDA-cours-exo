package org.example.exo3;

import java.util.Scanner;

public class Exo3 {

    public static Scanner scanner = new Scanner(System.in);
    public static void GetRightNumber() {
        int nbUser;

        do {
            System.out.println("Veuillez entrer un nombre compris entre 1 et 3");

            nbUser = scanner.nextInt();

        }while(nbUser<1 || nbUser>3);
        }

        public static void GetRightNumberOrElse(){

        int nbUser;

            do {
                System.out.println("Veuillez entrer un nombre compris entre 1 et 3");

                nbUser = scanner.nextInt();

                if(nbUser<21 && nbUser>9){
                    System.out.println("Plus petit!");
                }else if(nbUser>9){
                    System.out.println("Plus grand!");
                }

            }while(nbUser<9 || nbUser>21);

    }

    public static void getPlusTen() {

        System.out.println("Veuillez entrer un nombre");

       int  nbUser = scanner.nextInt();

        for (int i = 0; i < 10; i++) {

            nbUser = +1;
            System.out.println("Votre nombre plus "+i+" est : "+ nbUser);
        }

    }

    public static void getTableOfMultiplication(String[] args) {

        System.out.println("Veuillez entrer un nombre");

        int  nbUser = scanner.nextInt();

        System.out.println("• Table de "+nbUser);

        for (int i = 0; i < 10; i++) {

            int result = nbUser * i;

            System.out.println("• "+nbUser+" x "+i+" = "+result);

        }

    }

    public static void intChain(String[] args) {

        System.out.println("Veuillez entrer un nombre");

        int  nbUser = scanner.nextInt();
        int resultOne = 0;
        int result = 0;

        for (int i = 0; i < nbUser; i++) {
            resultOne +=  i;
            result = result +resultOne;
        }
        System.out.println("La somme des entiers de "+nbUser+" est :"+result);
    }

    public static void twentyNumbers(String[] args) {

        int counter=0;
        int biggerInt=0;

        do{
            counter ++;

            System.out.println("Veuillez entrer le nombre "+counter+ " :");
            int  nbUser = scanner.nextInt();

            for (int i = 0; i < 21; i++) {

                if(nbUser>biggerInt){
                    biggerInt = nbUser;
                }

            }

        }while(counter<20);

        System.out.println("Le plus grand de ces nombres est "+biggerInt);

    }

    public static void butWhatIndex() {

        int counter=0;
        int biggerInt=Integer.MIN_VALUE;
        int nbUser;
        int position = -1;

        do{
            counter ++;

            System.out.println("Veuillez entrer le nombre "+counter+ " :");
            nbUser = scanner.nextInt();

            for (int i = 0; i < 21; i++) {

                if(nbUser>biggerInt){
                    biggerInt = nbUser;
                    position = counter;

                }

            }

        }while(counter<20);

        System.out.println("Le plus grand de ces nombres est "+biggerInt);

    }

    public static void stopOnZero() {

        int counter=0;
        int biggerInt= Integer.MIN_VALUE;
        int nbUser;

        do{
            System.out.println("Veuillez entrer un autre nombre (vous pouvez interrompre la saisie en entrant '0') "+counter+ " :");
            nbUser = scanner.nextInt();
            counter ++;


                if(nbUser>biggerInt){
                    biggerInt = nbUser;
            }

        }while(nbUser!=0);

        System.out.println("Le plus grand de ces nombres est "+biggerInt);

    }


    public static void calculFacto() {

        System.out.println("Veuillez entrer un nombre");
        int  nbUser = scanner.nextInt();
        long facto = 1L;

        for (int i = 2; i <= nbUser; i++) {

            facto *= i ;



        }

        System.out.println("La factorielle de "+nbUser+" est : "+facto);

    }

    public static void yourPrice() {

        int priceUser;
        int totalPrice=0;
        int change;
        int payment;

        do{
            System.out.println("Veuillez entrer le prix de vos articles en entiers et terminée par zéro\nEntrer '0' pour terminer la commande");
            priceUser = scanner.nextInt();

            totalPrice += priceUser;

        }while(priceUser!=0);

        System.out.println("Comment souhaitez vous payer? Enter le montant de votre réglement");
        payment = scanner.nextInt();

        change = payment - totalPrice;

        while(change>20){
            change = change-20;
            System.out.println("20 €");
        }
        while(change>10){
            change = change-10;
            System.out.println("10 €");
        }
        while(change>5){
            change = change-5;
            System.out.println("5 €");
        }
        while(change>1){
            change = change-1;
            System.out.println("1 €");
        }

        if (change == 0){
            System.out.println("Vous avez reçu toute de votre monnaie, bye");
        }

    }

    public static void algoN() {

        int N = 0;

        while(N<=100){

            N +=1;

        }
        System.out.println("Le nombre 'N' "+N);

    }

}
