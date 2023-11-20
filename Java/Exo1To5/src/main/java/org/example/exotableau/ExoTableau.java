package org.example.exotableau;

public class ExoTableau {

    public static void ex51() {


        int [] tableau = {1, 2, 3, 6, 7, 3, 5, 10, 9, 10};

        for(int i = 0; i< tableau.length; i++){
            for (int j = i+1 ; j<tableau.length; j++){
                if (tableau[i]== tableau[j]){
                    System.out.println(tableau[i]+" a un doublon");
                    break;
                }
            }
        }

    }
    public static void ex52(){

        int [] tableau = {1, 2, 3, 6, 7, 3, 5, 10, 9, 10};
        int [] tableauB = {1,2,3,7,78,99};


        verifierOrdreCroissant(tableau);
        verifierOrdreCroissant(tableauB);
    }

    public static void verifierOrdreCroissant(int[] tableau) {
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] < tableau[i - 1]) {
                System.out.println("Ce tableau n'est pas rangé en ordre croissant");
                return;
            }
        }
        System.out.println("Ce tableau est rangé en ordre croissant");
    }

    public static void ex53(){

        int [] tableau = {1, 2, 3, 6, 7, 3, 5, 10, 9, 10};
        int [] tableauB = {1,2,3,7,78,99};

        getGap(tableau);
        getGap(tableauB);

    }

    public static void getGap(int[]tableau){
        int bigGap = 0;

        for (int i = 1; i<tableau.length; i++){
            int gap = Math.abs(tableau[i]-tableau[i-1]);
                if(gap > bigGap){
                    bigGap=gap;
                }
        }
        System.out.println("Le plus gand écart est "+bigGap);
    }

    public static void ex54(){
        char [] tableau = {'D','E','C','A','L','A','G','E'};

        char temp = tableau[tableau.length-1];
        for (int i = tableau.length - 1; i > 0; i--) {
            tableau[i] = tableau[i - 1];
        }
        tableau[0]= temp;

        for (int i =0; i<tableau.length; i++) {
            System.out.print(tableau[i]);
        }
    }

    public static void ex55(){

    }
    }



