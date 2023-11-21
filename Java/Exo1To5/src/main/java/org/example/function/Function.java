package org.example.function;

import java.sql.SQLOutput;
import java.util.Scanner;


public class Function {

    public static Scanner scanner = new Scanner(System.in);

    public static void ex_1() {


        System.out.println("Veuillez entrer de nombres entiers en les séparant par un expace\n\n");

        String readLine = scanner.nextLine();

        String[] nbrsStrs = readLine.split(" ");

        int[] nbrsTab = new int[nbrsStrs.length];

        for (int i = 0; i < nbrsStrs.length; i++) {

            int nbrs = Integer.parseInt(nbrsStrs[i]);
            nbrsTab[i] = nbrs;
        }

        getMaxNb(nbrsTab);
    }

    public static void getMaxNb(int[] tab) {

        int bigInt = 0;

        for (int i = 0; i < tab.length; i++) {

            if (tab[i] > bigInt) {
                bigInt = tab[i];
            }
        }

        System.out.println("Le plus grand nombre de votre série et : " + bigInt);

    }

    public static void ex_2() {

        System.out.println();
        System.out.println("***** Faisons un rectangle ensemble *****");

        System.out.println("Veuillez entrer la hauteur de notre rectangle");
        int height = scanner.nextInt();
        System.out.println("Veuillez entrer la largeur de notre rectangle");
        int width = scanner.nextInt();

        drawMyRectangle(height, width);
    }

    public static void drawMyRectangle(int h, int w) {

        StringBuilder bricks = new StringBuilder(" ");
        StringBuilder space = new StringBuilder(" ");
        int semi = Math.round(h/2);

        for (int i = 0; i < w; i++) {
            bricks.append(" *");
        }

        //space.append(" ");
        for (int i = 0; i < w; i++) {
            space.append(" ");
        }
        //space.append(" ");

        System.out.println(bricks);

        for (int i = 0; i < h - 2; i++) {
            if (i == semi) {
                space = new StringBuilder("*");
                for (int j = 0; j < w - 2; j++) {
                    space.append(" ");
                }
                space.append("*");

            } else {
                System.out.println(space);
            }
            System.out.println(bricks);
        }
    }

    public static void ex_3() {

        System.out.println();
        System.out.println("Parler nous de vous");

        String str = scanner.nextLine();

        String [] strArr = str.trim().split(" ");

        countMyWords(strArr);
    }

    public static void countMyWords(String[]tab) {

        System.out.printf("La phrase contient %s mots", tab.length);

    }
}


