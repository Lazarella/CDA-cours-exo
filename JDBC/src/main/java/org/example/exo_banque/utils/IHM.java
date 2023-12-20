package org.example.exo_banque.utils;

import org.example.exo_banque.service.AccountService;
import org.example.exo_banque.service.ClientService;

import java.util.Scanner;

public class IHM {

    private static ClientService clientService = new ClientService();
    private static AccountService accountService = new AccountService();

    private static Scanner scanner = new Scanner(System.in);

    public static void start() {

       boolean running = true;
       while(running){

           System.out.println("1 - Ouvrir votre premier compte");
           System.out.println("2 - Ouvrir un nouveau compte");
           System.out.println("3 - Effectuer un dépôt");
           System.out.println("4 Effectuer un retrait");

           int choice = scanner.nextInt();
           scanner.nextLine();

           switch (choice){
               case 1 -> createUser();
               case 2 -> createAccount();
               case 3 -> deposite() ;
               case 4 -> withdraw();
               default -> System.out.println("Choix invalide");
           }
       }


    }
       private static void createUser(){
            System.out.print("Nom  : ");
            String firstName = scanner.nextLine();
            System.out.print("Prenom : ");
            String lastName = scanner.nextLine();
        }
        private static void createAccount(){

        }
    private static void deposite(){

    }
    private static void withdraw(){

    }
}
