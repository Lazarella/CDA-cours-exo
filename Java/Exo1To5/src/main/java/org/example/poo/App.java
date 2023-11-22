package org.example.poo;

import org.example.poo.bancaire.CompteAbstract;
import org.example.poo.bancaire.CompteEpargne;
import org.example.poo.bancaire.ComptePayant;
import org.example.poo.bancaire.CompteSimple;
import org.example.poo.heritage.*;
import org.example.poo.tp1chaises.Chaise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public static void bank() {

        CompteSimple compteSAlain = new CompteSimple(2387.18,500);
        CompteSimple compteSSarah = new CompteSimple (3589.52, 300);
        CompteEpargne compteEElodie = new CompteEpargne(38);
        CompteEpargne compteEEtienne = new CompteEpargne(800);
        ComptePayant comptePPhilippe = new ComptePayant(1234.56);
        ComptePayant comptePPhylis = new ComptePayant (6543.21);

        List<CompteAbstract> comptes = new ArrayList<>();
        comptes.add(compteSAlain);
        comptes.add(compteSSarah);
        comptes.add(compteEElodie);
        comptes.add(compteEEtienne);
        comptes.add(comptePPhilippe);
        comptes.add(comptePPhylis);

//        for (CompteAbstract compte : comptes) {
//
//            System.out.println(compte);
//        }


        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\t***** Bienvenue au distributeur M2i\n");

        System.out.println("\tQuel est votre numero de compte ?\n");

        int codeClient = scanner.nextInt();

        boolean compteTrouve = false;
        int userEntry=9;

        for (CompteAbstract compte : comptes) {
            if (compte.getCode() == codeClient) { // Supposant que getNumCompte() est une méthode dans CompteAbstract
                System.out.println("Voici vos informations");
                System.out.println(compte);
                compteTrouve = true;
                break;
            }
        }

        if (!compteTrouve) {
            System.out.println("Numéro de compte introuvable.");
        }else {
            while (userEntry!=0){
                System.out.println("01 - Retrait");
                System.out.println("02 - Dépôt");

                switch (userEntry){
                    case 01 ->
                        compte
                }
            }
        }

    }
}
