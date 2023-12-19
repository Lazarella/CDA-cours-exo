package org.example.exoPerson.utils;
import org.example.exoPerson.DAO.PersonDAO;
import org.example.exoPerson.model.Person;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
public class ConsoleIHM {

    private Scanner scanner;

    Connection conn = null;
    public void IHM() {
        this.scanner = new Scanner(System.in);
    }

    public void start(){
        String choix;
        do {
            menu();
            choix = scanner.nextLine();
            switch (choix){
                case "1" -> addPerson();
                case "2" -> getAllPerson();
                case "3" -> getAPersonById();
                case "4" -> updatePerson();
                case "5" -> deletePerson();

            }

        }while (!choix.equals("0"));
    }
    private void menu(){
        System.out.println("1- Ajouter une personne");
        System.out.println("2- Afficher toutes les personnes");
        System.out.println("3- Afficher une personne en particulier (id)");
        System.out.println("4- Mettre les données d'une personne à jour");
        System.out.println("5- Supprimer une personne");
        System.out.println("0- Quitter");
    }
    private void addPerson(){
        System.out.println("Saisir le prénom : ");
        String firstName = scanner.nextLine();
        System.out.println("Saisir le nom : ");
        String lastName = scanner.nextLine();

        Person person = new Person(firstName, lastName);
        try {
            DatabaseManager dbManager = new DatabaseManager();
            Connection connection = dbManager.getConnection();

            PersonDAO personDao = new PersonDAO(connection);

            if(personDao.save(person)){
                System.out.println("Personne ajoutée avec l'id : " + person.getId());
            } else {
                System.out.println("Erreur lors de l'ajout de la personne en BDD");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    private void getAllPerson(){

    }
    private void getAPersonById(){

    }
    private void updatePerson(){

    }
    private void deletePerson(){

    }
}
