package org.example.matrix;

import java.util.Scanner;

public class Matrix {

    public static void ex_4() {

        System.out.println("\t***** Valeur la plus élevée *****");
        int[][] matrix = {{45, 23, 34, 56, 30}, {67, 75, 21, 52, 59}, {89, 34, 19, 19, 15}, {1, 78, 90, 48, 42}};
        int bigInt = 0;
        int biggestInt = 0;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 1; j < matrix.length; j++) {

                if (matrix[j][i] > matrix[j][i + 1]) {
                    bigInt = matrix[j][i];
                }
            }
            if (bigInt > biggestInt) {
                biggestInt = bigInt;
            }
        }
        System.out.println("La valeur la plus élevé de la matrice est " + biggestInt);
    }

    public static void ex_5() {

        System.out.println();
        System.out.println("\t***** Valeur la plus élevée *****");

        int[][] matrix = new int[4][5];
        int counter = 0;
        int somme = 0;
        long produit = 1L;
        float moyenne = 0;


        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                counter ++;
                matrix[i][j] = counter;
                somme += matrix[i][j];
                produit *= matrix[i][j];
                moyenne = (float) somme / counter;
            }

        }
        for (int[] row : matrix) {

            for (int valeur : row
            ) {
                System.out.println("Les valeurs du tableau 'matrix' sont : "+ valeur);
            }

        }
        System.out.println("La somme des valeurs du tableau est :"+somme);
        System.out.println("Le produit des valeurs de la matrice est : "+produit);
        System.out.println("La moyenne des valeurs de la matrice est : "+moyenne);
    }

    public static void ex_6() {

        System.out.println();
        System.out.println("\t***** Vendeurs et voitures *****");



        String [][] matrix = new String[4][4];

        matrix [0][0] = "La Super Team";
        matrix [0][1] = "Sarah";
        matrix [0][2] = "Jean-Michel";
        matrix [0][3] = "Fred";

        matrix [1][0] = "Bugatti";
        matrix [1][1] = "Lotus";
        matrix [1][2] = "Ford";
        matrix [1][3] = "Lexus";

Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez choisir le numéro de votre vendeur\n1-Sarah\n2-Jean-Michel\n3-Fred");
        int coor1 = scanner.nextInt();
        System.out.println("Veuillez choisir le numéro correspondant à la marque du ou des véhicules vendus\n0-Bugatti\n1-Lotus\n2-Ford\n3-Lexus");
        int coor2 = scanner.nextInt();
        System.out.println("Combien de véhicules ont été vendu en totalité");
        String nbCar = scanner.next();

        addSells(matrix, coor1, coor2, nbCar);
        scanner.close();

    }

    public static void addSells(String[][] tab, int coor1, int coor2, String nbCar) {

        tab[coor2][coor1] = nbCar;

        }


    }

