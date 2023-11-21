package org.example.exo.string;

import jdk.dynalink.beans.StaticClass;

import java.util.Arrays;
import java.util.Scanner;

public class ExoString {

    public static Scanner scanner = new Scanner(System.in);

    public static void comptageDeMot() {

        System.out.println("\t ***** Comptage de mots *****");

        String str = "Salut les petits potes!";

        String[] strArr = str.split(" ");

        System.out.printf("La phrase contient %s mots", strArr.length);

    }

    public static void comptageOccurence() {

        System.out.println();
        System.out.println("\t ***** Occurences d'un charactère *****\n");

        String str = "transmettez";
        char myChar = 't';

        getMyChar(str, myChar);

    }

    public static void getMyChar(String str, char x) {

        int counter = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == x) {
                counter++;

            }

        }
        System.out.printf("Il y a %d occurences de '%c' dans le mot '%s'", counter, x, str);
    }

    public static void anagramme() {
        System.out.println();
        System.out.println("\t ***** Anagramme *****\n");

        System.out.println("Veuillez entrer un mot puis son anagramme : ");

        String strUser = scanner.next();
        String anagramUser = scanner.next();

        checkForAnagrams(strUser, anagramUser);

    }

    public static void checkForAnagrams(String str1, String str2) {

        if (str1.length() != str2.length()) {
            System.out.printf("'%s' n'est pas un anagramme de '%s'", str1, str2);
        } else {

            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)) {
                System.out.printf("'%s' est un anagramme de '%s'%n", str1, str2);
            } else {
                System.out.printf("'%s' n'est pas un anagramme de '%s'%n", str1, str2);
            }
        }

    }

    public static void palindrome() {

        System.out.println();
        System.out.println("\t ***** Palindrome *****\n");

        System.out.println("Veuillez entrer un palindrome : ");

        String strUser = scanner.next();

        checkForPalindrom(strUser);

    }

    public static void checkForPalindrom(String str) {

        char[] charArray = str.toCharArray();
        boolean isPalindrome = true;

        for (int i = 0; i < charArray.length / 2; i++) {
            if (str.charAt(i) != str.charAt(charArray.length - 1 - i)) {
                System.out.printf("'%s' n'est pas un palindrome", str);
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.printf("'%s' est un palindrome, félicitations!", str);
        }
    }

    public static void pyramid() {
        System.out.println();
        System.out.println("\t ***** La Pyramide! *****\n");

        System.out.println("Quelle est la hauteur de la pyramide (entrez un nombre entier) : ");

        int height = scanner.nextInt();
        int counter = 0;
        String bricks = "\n";
        StringBuilder newBricks = new StringBuilder(bricks);

        while (counter != height) {
            for (int i = 0; i < height; i++) {
                bricks = bricks + "*";
                System.out.println(bricks);
                counter++;
            }
            for (int i = height - 1; i > 0; i--) {
                bricks = bricks.substring(0, i);
                System.out.println(bricks);
            }

        }
    }
}