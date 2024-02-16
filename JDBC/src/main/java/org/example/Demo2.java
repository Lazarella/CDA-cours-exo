package org.example;

import org.example.utils.ConnectionUtils;

import java.sql.*;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        // Test de connection

//        try {
//            Connection connection = ConnectionUtils.getMySQLConnection();
//            if (connection != null){
//                System.out.println("connexion ok ok !");
//            }else{
//                System.out.println("connexion not NOT ok");
//            }
//        }catch(RuntimeException e) {
//        }
//
        Scanner scan = new Scanner(System.in);
        Connection connection = null;

        try {
            connection = ConnectionUtils.getMySQLConnection();
            System.out.println("connexion ok");
            System.out.println("Merci de saisir le prénom : ");
            String firstname = scan.nextLine();
            System.out.println("Merci de saisir le nom : ");
            String lastname = scan.nextLine();
            // Requete pour l'insertion de données
            //String request = "INSERT INTO person (first_name, last_name) VALUES ('"+firstname+"','"+lastname+"')";

            // premiere solution => execution d'une requête sans retour
            //Statement statement = connection.createStatement();
            //boolean res = statement.execute(request);
            //System.out.println("Requête executée");
            //System.out.println((res));

            // deuxième solution => avec une requete preparée

            // version sans récupération d'id
//            String request = "INSERT INTO person (first_name, last_name) VALUES (?,?)";
//            PreparedStatement preparedStatement = connection.prepareStatement(request);
//            preparedStatement.setString(1, firstname);
//            preparedStatement.setString(2, lastname);
//            preparedStatement.execute(); // retour boolean
//            int nbRows = preparedStatement.executeUpdate(); // retour int
//            System.out.println("Nombre de ligne :" + nbRows);

            // version avec récupération d'id
//            String request = "INSERT INTO person (first_name, last_name) VALUES (?,?)";
//            PreparedStatement preparedStatement = connection.prepareStatement(request,Statement.RETURN_GENERATED_KEYS);
//            preparedStatement.setString(1, firstname);
//            preparedStatement.setString(2, lastname);
//            preparedStatement.execute(); // retour boolean
//            int nbRows = preparedStatement.executeUpdate();
//            ResultSet resultSet = preparedStatement.getGeneratedKeys();
//            System.out.println("Nombre de ligne :" + nbRows);
//            if (resultSet.next()){
//                System.out.println(resultSet.getInt(1));
//            }

            //Avec une requete de lecture

            String request = "SELECT * FROM person";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(request);
            while(resultSet.next()){
                System.out.println(
                        resultSet.getInt("id") + " - " +
                                resultSet.getString("first_name") + " " +
                                resultSet.getString("last_name"));
            }




        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            // Ferme la connection à la bdd
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
