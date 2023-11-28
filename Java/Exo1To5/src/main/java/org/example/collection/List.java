package org.example.collection;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        //ArrayList <type> nom = new ArrayList<type>() ;
        ArrayList<String> prenoms = new ArrayList<String>();

        // LA méthode add() permet d'ajouter des éléments
        prenoms.add("Ariel");
        prenoms.add("Sébastien");
        prenoms.add("Polochon");
        //prenoms.add(42); //error

        // LA méthode get() permet de récupérer un élément
        System.out.println(prenoms.get(0));
        System.out.println(prenoms.get(1));
        System.out.println(prenoms.get(2));

        // La méthode set() permet de modifier un element

        prenoms.set(1, "Captain Crab");
        System.out.println(prenoms.get(1));

        // La méthode remove() permet de supprimer un élément
        // La méthode size() permet de retourner la taille de ma liste

        System.out.println(prenoms.size());
        prenoms.remove(0);
        System.out.println(prenoms.size());

        // Parcourir avec la boucle for

        for (int cpt = 0; cpt <prenoms.size() ; cpt++) {
            System.out.println(prenoms.get(cpt));
        }

        // Parcourir avec la boucle for each

        for (String p: prenoms
             ) {
            System.out.println(p);
        }
        }
}
