package org.example.util;

import org.example.exception.CustomFormatException;
import org.example.model.Customer;
import org.example.model.Event;
import org.example.model.EventLocation;
import org.example.service.CustomerService;
import org.example.service.EventLocationService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
    public class Ihm {
        protected List<EventLocation> listEventLocation = new ArrayList<>();
        protected List<Customer> listCLient = new ArrayList<>();
        protected List<Event> listEvent = new ArrayList<>();

        private Scanner s = new Scanner(System.in);

        public Ihm() {
        }

        public void start() {
            this.menuGenerale();
        }

        public void menuGenerale (){
            try{
                System.out.println("----------menu---------");
                System.out.println("1/ action Lieux");
                System.out.println("2/ action Evenements");
                System.out.println("3/ action client");
                System.out.println("0/ quitter");
                System.out.println("entrez votre choix :");
                int entry = s.nextInt();
                switch (entry){
                    case 1:
                        this.menuLieux();
                        break;
                    case 2 :
                        this.menuEvenement();
                        break;
                    case 3:
                        menuCLient ();
                        break;
                    case 0 :
                        break;
                    default:
                        System.out.println("entrer une valeur correspondant a un choix");
                        this.menuGenerale();
                        break;
                }

            }
            catch (InputMismatchException e){
                System.out.println("entrer une valeur numerique ");
                this.menuGenerale();
            }

        }

        //gestion des lieux

        public void menuLieux (){
            try{
                System.out.println("---------- Menu des Salles ---------");
                System.out.println("1/ ajouter un lieu");
                System.out.println("2/ modifier un lieu");
                System.out.println("3/ supprimer un lieu");
                System.out.println("0/ retourner au menu generale");
                System.out.println("entrer votre choix :");
                int entry = s.nextInt();
                switch (entry){
                    case 1:
                        this.addLieux();
                        break;
                    case 2:
                        this.modifLieu();
                        break;
                    case 3 :
                        this.suprLieu();
                        break;
                    case 0:
                        this.menuGenerale();
                        break;
                    default :
                        System.out.println("entrer une valeur correspondant a un choix");
                        this.menuLieux();
                        break;
                }
            }
            catch (InputMismatchException e){
                System.out.println("entrer une valeur numerique ");
                this.menuLieux();
            }
        }

        public void addLieux (){
            try {
                System.out.println("-------- Ajouter lieu ----------");
                System.out.println("Entrez le nom du lieu :");
                String nomLieux = s.next();
                s.nextLine();
                System.out.println("Entrez l'adresse du lieu :");
                String adresse = s.nextLine();
                int capacite = this.entryCapacity();

                EventLocationService eventLocationService = new EventLocationService();
                eventLocationService.createEventLocation(nomLieux, adresse, capacite);

                this.listEventLocation.add(new EventLocation(nomLieux,adresse,capacite));
                System.out.println("le lieux a bien été ajouter :");
                System.out.println(listEventLocation.get(listEventLocation.size()-1));
                this.menuLieux();
            }
            catch (InputMismatchException e){
                System.out.println("Entrez une valeur numérique ");
                this.addLieux();
            } catch (CustomFormatException e) {
                throw new RuntimeException(e);
            }
        }

        public void modifLieu (){
            try{
                try{
                    System.out.println("-------- Modifier lieu ----------");
                    afficheList(this.listEventLocation);
                    System.out.println("Quel salle voulez vous modifier : ");
                    int entry = s.nextInt();

                    System.out.println(this.listEventLocation.get(entry-1));
                    System.out.println("Entrez le nouveau nom : ");
                    String nom =s.next();
                    System.out.println("Entrez la nouvelle adresse : ");
                    String adresse = s.next();
                    int capacite = this.entryCapacity();

                    this.listEventLocation.set(entry-1,new EventLocation(nom,adresse,capacite));
                    System.out.println(this.listEventLocation.get(entry-1));
                    this.menuLieux();
                }
                catch (IndexOutOfBoundsException e){
                    this.menuLieux();
                } catch (CustomFormatException e) {
                    throw new RuntimeException(e);
                }
            }
            catch (InputMismatchException e){
                System.out.println("entrer une valeur numerique ");
                this.modifLieu();
            }
        }

        public void suprLieu (){
            try{
                System.out.println("--------supr lieu----------");
                afficheList(this.listEventLocation);
                System.out.println("quelle lieux vouler vous supprimer (0 pour retour) : ");
                int entry = s.nextInt();

                if(entry == 0){
                    this.menuLieux();
                }
                else{
                    this.listEventLocation.remove(entry-1);
                    System.out.println("le lieux a bien ete supprimer");
                    this.menuLieux();
                }
            }
            catch( InputMismatchException e){
                System.out.println("entrer une valeur numerique ");
                this.suprLieu();
            }
        }

        public int entryCapacity (){
            int entry =0;
            do {
                System.out.println("Entrez la capacité d'accueil du lieu :");
                entry = s.nextInt();
            }
            while (entry<=0);

            return entry;
        }



        // gestion des evenements

        public void menuEvenement (){
            try{
                System.out.println("----------menu Evenement---------");
                System.out.println("1/ ajouter un Evenement");
                System.out.println("2/ modifier un Evenement");
                System.out.println("3/ supprimer un Evenement");
                System.out.println("4/ afficher la liste des evenements");
                System.out.println("0/ retourner au menu generale");
                System.out.println("entrer votre choix :");
                int entry = s.nextInt();
                switch (entry){
                    case 1:
                        this.addEvenement();
                        break;
                    case 2:

                        break;
                    case 3 :
                        this.suprEvenement();
                        break;
                    case 4 :
                        this.afficheList(this.listEventLocation);
                        break;
                    case 0:
                        this.menuGenerale();
                        break;
                    default :
                        System.out.println("entrer une valeur correspondant a un choix");
                        this.menuEvenement();
                        break;
                }
            }
            catch (InputMismatchException e){
                System.out.println("entrer une valeur numerique ");
                this.menuCLient();
            }
        }

        public void addEvenement (){
            try {
                System.out.println("-------- Ajouter un événement ----------");

                System.out.println("Entrez le nom de l'événement:");
                String nom = s.next();

                System.out.println("entrer la date de l'événement (format dd-MM-yyyy):");
                String date_string = s.next();
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                Date date = formatter.parse(date_string);

                System.out.println("Entrez l'heure de l'événement :");
                String heure = s.next();

                System.out.println();
                this.afficheList(listEventLocation);
                System.out.println("Sélectionner le lieu de l'événement :");
                int lieux = s.nextInt();

                System.out.println("Entrez le prix du billet");
                float prix = s.nextFloat();


                this.listEvent.add(new Event(nom, date, heure,this.listEventLocation.get(lieux-1)));
                System.out.println("L'événement a bien été ajouté :");
                System.out.println(listEventLocation.get(listEvent.size()-1));
                this.menuEvenement();
            }
            catch (InputMismatchException e){
                System.out.println("Entrez une valeur numérique ");
                this.addEvenement();
            } catch (ParseException e) {
                throw new RuntimeException(e);
//            } catch (CustomFormatException e) {
//                throw new RuntimeException(e);
            }
        }

        public void suprEvenement (){
            try{
                System.out.println("-------- Supprimer un  événement ----------");
                afficheList(this.listEvent);
                System.out.println("Quel événement voulez-vous supprimer (0 pour retour) : ");
                int entry = s.nextInt();

                if(entry == 0){
                    this.menuEvenement();
                }
                else{
                    this.listEventLocation.remove(entry-1);
                    System.out.println("l'événement a bien été supprimer.");
                    this.menuEvenement();
                }
            }
            catch( InputMismatchException e){
                System.out.println("entrer une valeur numérique ");
                this.suprEvenement();
            }
        }

        //gestion client

        public void menuCLient (){
            try{
                System.out.println("----------Menu Client---------");
                System.out.println("1 - Ajouter un client");
                System.out.println("2 - Modifier un client");
                System.out.println("3 - Supprimer un client");
                System.out.println("4 - Acheter un billet");
                System.out.println("5 - Annuler un billet");
                System.out.println("6 - Afficher la liste des billets d'un clients");
                System.out.println("0 - Retourner au menu générale");
                System.out.println("Votre choix ⇒ ");
                int entry = s.nextInt();
                switch (entry){
                    case 1:
                        this.addClient();
                        break;
                    case 2:
                        this.modifClient();
                        break;
                    case 3 :
                        this.suprClient();
                        break;
//                    case 4 :
//                        achatBillet(true);
//                        break;
//                    case 5 :
//                        achatBillet(false);
//                        break;
//                    case 6:
//                        affichageBillet();
//                        break;
                    case 0:
                        this.menuGenerale();
                        break;
                    default :
                        System.out.println("Votre choix : ");
                        this.menuCLient();
                        break;
                }
            }
            catch (InputMismatchException e){
                System.out.println("Entrer une valeur numérique :");
                this.menuCLient();
            }
        }

        public void addClient (){
            try {
                System.out.println("-------- Ajouter un cLient ----------");
                System.out.println("Entrez le nom du client :");
                String nom = s.next();

                System.out.println("Entrez le prénom du client :");
                String prenom = s.next();

                System.out.println("Entrez l'email du client : ");
                String email = s.next();

                CustomerService customerService = new CustomerService();
                customerService.createCustomer(prenom, nom, email);

                this.listCLient.add(new Customer(nom,prenom,email));
                System.out.println("le cLient a bien été ajouté :");
                System.out.println(listCLient.get(listCLient.size()-1));
                this.menuEvenement();
            }
            catch (InputMismatchException e) {
                System.out.println("Entrez une valeur numérique ");
                this.addEvenement();
            } catch (CustomFormatException e) {

            }
        }

        public void modifClient (){
            try{
                try{
                    System.out.println("-------- Modifier un dossier client ----------");
                    afficheList(this.listCLient);
                    System.out.println("Quel client voulez vous modifier : ");
                    int entry = s.nextInt();

                    System.out.println(this.listCLient.get(entry-1));
                    System.out.println("Entrez le nouveau nom : ");
                    String nom =s.next();
                    System.out.println("Entrez le nouveau prénom : ");
                    String prenom = s.next();
                    System.out.println("Entrez la nouvelle adresse mail : ");
                    String email = s.next();

                    this.listCLient.set(entry-1,new Customer(nom,prenom,email));
                    System.out.println(this.listCLient.get(entry-1));
                    this.menuCLient();
                }
                catch (IndexOutOfBoundsException e){
                    this.menuCLient();
                }
            }
            catch (InputMismatchException e){
                System.out.println("Entrez une valeur numérique ");
                this.modifClient();
            }
        }

        public void suprClient (){
            try{
                System.out.println("-------- Supprimer un client----------");
                afficheList(this.listCLient);
                System.out.println("Quel client voulez-vous supprimer (0 pour retour) : ");
                int entry = s.nextInt();

                if(entry == 0){
                    this.menuCLient();
                }
                else{
                    this.listCLient.remove(entry-1);
                    System.out.println("le client a bien été supprimé");
                    this.menuCLient();
                }
            }
            catch( InputMismatchException e){
                System.out.println("Entrez une valeur numérique ");
                this.suprClient();
            }
        }

//        public void achatBillet (boolean achat){
//            try{
//                if (achat){
//                    System.out.println("---------achat billet -----------");
//                }
//                else{
//                    System.out.println("---------Annulation billet -----------");
//                }
//
//                afficheList(this.listCLient);
//                System.out.println("choisissez un client :");
//                int client = s.nextInt();
//
//                System.out.println("client choisi "+ this.listCLient.get(client-1));
//
//                afficheList(this.listEvent);
//                System.out.println("choisissez un évènemement");
//                int event = s.nextInt();
//
//                if(achat){
//                    this.listCLient.get(client-1).acheterBillet(this.listEvenement.get(event-1));
//                }
//                else {
//                    this.listCLient.get(client-1).annulerBillet(this.listEvenement.get(event-1));
//                }
//                this.menuCLient();
//            }
//            catch (IndexOutOfBoundsException e){
//                System.out.println("index out of bound");
//                this.menuCLient();
//            }
//            catch (InputMismatchException e){
//                System.out.println("entrer une valeur valide");
//                this.achatBillet(achat);
//            }
//        }

//        public void affichageBillet (){
//            try{
//                System.out.println("---------afffichage des billets----------");
//                afficheList(this.listCLient);
//                System.out.println("choisiser un client :");
//                int client = s.nextInt();
//
//                this.afficheList(this.listCLient.get(client-1).getListeBillets());
//
//                this.menuCLient();
//            }
//            catch (IndexOutOfBoundsException e){
//                System.out.println("index out of bound");
//                this.menuCLient();
//            }
//            catch (InputMismatchException e){
//                System.out.println("entrer une valeur valide");
//                this.affichageBillet();
//            }
//        }

        //fonctions global
        public void afficheList (List list){
            list.forEach(System.out::println);
            System.out.println();
        }




    }


