package org.example.exo.exercice_jdbc_1;

import org.example.exo.exercice_jdbc_1.utils.Services;

import java.sql.Connection;
import java.util.Scanner;

public class IHM {
    public static void start() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("0 - Ajouter un ou une étudiante");
            System.out.println("1 - Afficher la totalité des étudiants");
            System.out.println("2 - Afficher les étudiants d'une classe");
            System.out.println("3 - Supprimer un étudiant");
            System.out.println("4 - Quitter");

            System.out.print("Entrez votre choix: ");
            String userInput = scan.nextLine();
            int userChoice;
            try {
                userChoice = Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Veuillez entrer un nombre valide.");
                continue;
            }

            switch (userChoice) {
                case 0 -> Services.addStudent();
                case 1 -> Services.getStudents();
                case 2 -> Services.getStudentOneClasse();
                case 3 -> Services.deleteStudent();
                case 4 -> {
                    System.out.println("Quitting...");
                    return;
                }
                default -> System.out.println("Choix non valide. Veuillez réessayer.");
            }
        }
    }
}

