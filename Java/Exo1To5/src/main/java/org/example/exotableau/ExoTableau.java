package org.example.exotableau;

public class ExoTableau {

    public static void ex51() {


        int[] tableau = {1, 2, 3, 6, 7, 3, 5, 10, 9, 10};

        for (int i = 0; i < tableau.length; i++) {
            for (int j = i + 1; j < tableau.length; j++) {
                if (tableau[i] == tableau[j]) {
                    System.out.println(tableau[i] + " a un doublon");
                    break;
                }
            }
        }

    }

    public static void ex52() {

        int[] tableau = {1, 2, 3, 6, 7, 3, 5, 10, 9, 10};
        int[] tableauB = {1, 2, 3, 7, 78, 99};


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

    public static void ex53() {

        int[] tableau = {1, 2, 3, 6, 7, 3, 5, 10, 9, 10};
        int[] tableauB = {1, 2, 3, 7, 78, 99};

        getGap(tableau);
        getGap(tableauB);

    }

    public static void getGap(int[] tableau) {
        int bigGap = 0;

        for (int i = 1; i < tableau.length; i++) {
            int gap = Math.abs(tableau[i] - tableau[i - 1]);
            if (gap > bigGap) {
                bigGap = gap;
            }
        }
        System.out.println("Le plus gand écart est " + bigGap);
    }

    public static void ex54() {
        char[] tableau = {'D', 'E', 'C', 'A', 'L', 'A', 'G', 'E' };

        char temp = tableau[tableau.length - 1];
        for (int i = tableau.length - 1; i > 0; i--) {
            tableau[i] = tableau[i - 1];
        }
        tableau[0] = temp;

        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + "\n");
        }
    }

    public static void ex55() {
        int[] tableau = {1, 2, 3, 6, 7, 3, 5, 10, 9, 10};

        for (int i = 0; i < tableau.length / 2; i++) {
            int temp = tableau[i];
            tableau[i] = tableau[tableau.length - 1 - i];
            tableau[tableau.length - 1 - i] = temp;

        }

        for (int valeur : tableau) {
            System.out.print(valeur + " ");
        }
    }

    public static void ex56() {
        int[] tableau = {1, 2, 3, 6, 7, 3, 5, 10, 9, 10};

        for (int i = 0; i < tableau.length; i++) {
            int index = i;
            for (int j = i + 1; j < tableau[index]; j++) {
                if (tableau[j] < tableau[index]) {
                    index = j;
                }
            }
            int min = tableau[index];
            tableau[index] = tableau[i];
            tableau[i] = min;
        }
        System.out.println("\n Tri à séléction \n");
        for (int valeur : tableau) {
            System.out.print(valeur + " ");
        }
    }

    public static void ex57() {
        int temp = 0;
        int[] tableau = {1, 2, 3, 6, 7, 3, 5, 10, 9, 10};

        for (int i = 0; i < tableau.length; i++) {
            for (int j = 1; j < tableau.length - 1; j++) {
                if (tableau[j - 1] > tableau[j]) {
                    temp = tableau[j - 1];
                    tableau[j - 1] = tableau[j];
                    tableau[j] = temp;
                }
            }

        }
        System.out.println("\n Tri à bulle \n");
        for (int valeur : tableau) {
            System.out.print(valeur + " ");
        }
    }

    public static void ex58() {
        int[][] tabA = new int[3][4];
        int[][] tabB = new int[2][];
        int [][] tabC = new int [3][4];
        tabB[0] = new int[3];
        tabB[1] = new int[6];

        initialTabRegular(tabA);
        initialTabRegular(tabC);
        initialTabIrregular(tabB);

        checkTab(tabA, tabB);
        checkTab(tabA, tabC);

    }

    public static int[][] checkTab(int [][] tab1, int [][] tab2){

        if ( tab1.length != tab2.length) {
            System.out.println("Les tableaux n'ont pas le même nombre de lignes");
            return null;
        }

        int [][] tabResult= new int[tab1.length][];

            for (int i = 0 ; i< tab1.length; i++){
                if(tab1[i].length != tab2[i].length){
                    System.out.println("Les lignes n'ont pas la même longueur");
                    return null;
                }
                tabResult[i] = new int[tab1[i].length];
                for (int j = 0; j < tab1[i].length; j++) {
                    tabResult[i][j] = tab1[i][j] + tab2[i][j];
                }
            }
        for (int i = 0; i < tabResult.length; i++) {
            for (int j = 0; j < tabResult[i].length; j++) {
                System.out.print(tabResult[i][j] + " ");
            }
            System.out.println();
        }
        return tabResult;

    }

    public static void initialTabRegular(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = (int)(Math.random()*100);
            }
        }

    }
    public static void initialTabIrregular(int[][] tab){
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = (int)(Math.random()*100);
            }
        }
    }
}



