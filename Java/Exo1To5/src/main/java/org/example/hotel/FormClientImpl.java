package org.example.hotel;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FormClientImpl implements FormClient{

    @Override
    public Client addClient(String firstNAme, String lastNAme, String phone, String mail ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pour entrer un nouveau client, veuillez renseigner ses informations.");
        System.out.println("Nom de famille : ");
        String lastName = scanner.next().toUpperCase().trim();
        System.out.println("Prénom :");
        String firstName = scanner.next();
        System.out.println("Numéro de téléphone :");
        String phone = scanner.next();
        System.out.println("Un mail :");
        String mail = scanner.next();

        Client newClient = new Client(firstName, lastName,phone, mail);

        return newClient ;
    }

    public RoomStatus ResaStatus(long idResa){

        return RoomStatus;
    }

}
