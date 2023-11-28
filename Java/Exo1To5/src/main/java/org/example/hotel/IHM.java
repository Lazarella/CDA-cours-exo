//package org.example.hotel;
//
//import java.util.Scanner;
//
//import static java.lang.Integer.parseInt;
//
//public class IHM {
//
//    private static Scanner scanner = new Scanner(System.in);
//
//    private static Hotel hotel;
//    public static void start(){
//        System.out.println("Quel est le nom de l'hotel ?");
//        String hotelName = scanner.nextLine();
//
//        hotel = new Hotel(hotelName);
//
//        System.out.println("L'hotel "+ hotel.getName()+" est cree");
//
//       initializingHotel(hotelName);
//       menu();
//    };
//    public static void initializingHotel(String hotelName){
//        hotel = new Hotel(hotelName, new Room[]{
//                new Room(3, 150 ),
//                new Room(3, 150 ),
//                new Room(3, 150 ),
//                new Room(3, 150 ),
//                new Room(3, 150 ),
//                new Room(3, 150 ),
//                new Room(3, 150 ),
//                new Room(3, 150 ),
//                new Room(3, 150 ),
//                new Room(3, 150 ),
//                new Room(3, 150 ),
//                new Room(3, 150 ),
//                new Room(3, 150 ),
//                new Room(3, 150 ),
//                new Room(3, 150 ),
//                new Room(3, 150 ),
//                new Room(3, 150 ),
//                new Room(3, 150 )
//        });
//    }
//    public static void menu(){
//        String choices[] = {
//                "1 - Ajouter un client",
//                "2 - Afficher la listes des clients",
//                "3 - Afficher la reservation d'un client",
//                "4 - Ajouterune reservation",
//                "5 - Annuler une réservation",
//                "6 - Afficher la liste des reservations",
//                "0 - Quitter"
//        };
//        System.out.println("Bienvenue à l'hotel "+hotel.getName());
//        for (String c: choices
//             ) {
//            System.out.println(c);
//
//        }
//        int choice = parseInt(scanner.next());
//
//        switch (choice){
//            case 1 -> {
//                addClient();
//                menu();
//            }
//            case 2 -> {
//                menu();
//                displayClient();
//            }
//            case 3 -> {
//                displayResaClient();
//                menu();
//            }
//            case 4 -> {
//                addResa();
//                menu();
//            }
//            case 5 -> {
//                deletResa();
//                menu();
//            }
//            case 6 -> {
//                displayAllResa();
//                menu();
//            }
//            case 0 -> {
//                menu();
//            }
//            default -> {
//                System.out.println("Choix Invalide!");
//            }
//        }
//    }
//    public static void addClient(){
//        System.out.println("Ajout d'un client");
//        System.out.println("Nom de famille: ");
//        String lastName = scanner.next();
//        System.out.println("Prénom");
//        String firstName = scanner.next();
//        System.out.println("Téléphone : ");
//        String phone = scanner.next();
//
//        if (hotel.addClient(firstName, lastName, phone)){
//            System.out.println("Client ajouté");
//        }else{
//        }
//    } public static void displayClient(){
//        System.out.println("Affichage du dossier client");
//        for (Client c : hotel.getClients()
//             ) {
//            if(c!= null) {
//                System.out.println(c);
//            }
//        }
//    } public static void displayResaClient(){
//        System.out.println("Affichage de la réservation du client");
//    } public static void addResa(){
//        System.out.println("Ajout d'une réservation");
//        System.out.println("Id du client : ");
//       int idClient = parseInt(scanner.next());
//        System.out.println("Id de la chambre");
//        if (hotel.getNbRoom().getRoomstatus() == RoomStatus.EMPTY) {
//            Reservation reservation = new Reservation(hotel.getClients()[idClient - 1], hotel.getNbRoom()[idRoom - 1], ResaStatus.RESERVED);
//            hotel.getNbRoom()[idRoom-1].setRoomstatus(RoomStatus.OCCUPIED);
//        }else {
//            System.out.println("Chambre indisponnible");
//        }
//    } public static void deletResa(){
//        System.out.println("Supprimer une réservation");
//        System.out.println("Id Reservation : ");
//        int idResa = parseInt(scanner.next());
//        reservation
//        hotel.getNbReservation();
//
//    } public static void displayAllResa(){
//        System.out.println("Affichage de toutes les réservations");
//    }
//}
