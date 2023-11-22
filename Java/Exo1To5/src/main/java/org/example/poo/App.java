package org.example.poo;

import org.example.poo.heritage.*;
import org.example.poo.tp1chaises.Chaise;

public class App {
    public static void displayChair() {
        Chaise chaise1 = new Chaise("Bois", 4, "Bleu");
        Chaise chaise2 = new Chaise("Métal", 4, "Blanche");
        Chaise chaise3 = new Chaise("Pléxiglass", 1, "Transparent");

        Chaise [] chairs = {chaise1, chaise2, chaise3};

        for (Chaise value : chairs
        ) {


            System.out.println("***** Affichage d'un nouvelle Objet *****");
            System.out.println();

            System.out.printf("Je suis une Chaise, avec %d en %s et de couleur %s", value.getFeet(), value.getMaterial(), value.getColor());
            System.out.println();

            System.out.println("**********");
        }
    }

    public static void displayPerson() {

        Person a = new Person("Alan", 37);
        a.greets();
        Student b = new Student("Beatrix",23);
        b.greets();
        b.displayAge();
        Teacher c = new Teacher("Christophe", 35);
        c.greets();
        c.explain();
    }

    public static void displayHouse() {

        Door d = null;
        d = new Door("Bleue");
        House h = new House(80, d);
        Appartement a = new Appartement();
        PersonHouse p = new PersonHouse("Patrique", h);


//       h.display();
//       d.display();
//       a.display();
        p.display();

    }
}
