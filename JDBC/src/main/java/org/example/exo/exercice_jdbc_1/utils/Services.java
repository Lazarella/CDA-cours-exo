package org.example.exo.exercice_jdbc_1.utils;

import java.sql.*;
import java.util.Scanner;

public class Services {

    public static void addStudent() {

        Scanner scan = new Scanner(System.in);
        Connection connection = null;

        try {
            connection = org.example.utils.ConnectionUtils.getMySQLConnection();
            System.out.println("connexion ok");
            System.out.println("Merci de saisir le prénom : ");
            String firstname = scan.nextLine();
            System.out.println("Merci de saisir le nom : ");
            String lastname = scan.nextLine();
            System.out.println("Merci de saisir la classe de l'élève : ");
            String gradeNum = scan.nextLine();
            System.out.println("Merci de saisir la date d'obtention de diplôme (YYYY-MM-DD) : ");
            String graduationDate = scan.nextLine();

            String request = "INSERT INTO student (first_name, last_name,gradeNum,graduation_date) VALUES (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(request);
            preparedStatement.setString(1, firstname);
            preparedStatement.setString(2, lastname);
            preparedStatement.setString(3,gradeNum);
            preparedStatement.setString(4,graduationDate);
            int nbRows = preparedStatement.executeUpdate(); // retour int
            System.out.println("Nombre de ligne :" + nbRows);
        }catch (SQLException e) {
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
    public static void getStudents() {
        Scanner scan = new Scanner(System.in);
        Connection connection = null;

        try {
            String request = "SELECT * FROM student";
            connection = ConnectionUtils.getMySQLConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(request);
            System.out.println("connexion ok!");


            while (resultSet.next()) {
                System.out.println(
                        resultSet.getInt("id") + " - " +
                                resultSet.getString("first_name") + " " +
                                resultSet.getString("last_name") + " " +
                                resultSet.getString("gradeNum") + " " +
                                resultSet.getDate("graduation_date")
                );
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void getStudentOneClasse() {

        Scanner scan = new Scanner(System.in);
        try (Connection connection = ConnectionUtils.getMySQLConnection()) {
            System.out.println("Veuillez entrer le numéro de grade (gradNum)");
            String gradNum = scan.nextLine();

            String request = "SELECT * FROM student WHERE gradeNum = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(request)) {
                preparedStatement.setString(1, gradNum);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    System.out.println("connexion ok!");
                    while (resultSet.next()) {
                        System.out.println(
                                resultSet.getInt("id") + " - " +
                                        resultSet.getString("first_name") + " " +
                                        resultSet.getString("last_name") + " " +
                                        resultSet.getString("gradNum") + " " +
                                        resultSet.getDate("graduation_date")
                        );
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteStudent() {
        Scanner scan = new Scanner(System.in);
        Connection connection = null;

        try {
            connection = ConnectionUtils.getMySQLConnection();

            System.out.println("Entrez l'ID de l'étudiant à supprimer :");
            int studentId = Integer.parseInt(scan.nextLine());

            String request = "DELETE FROM student WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(request);
            preparedStatement.setInt(1, studentId);

            int nbRows = preparedStatement.executeUpdate();
            System.out.println("Nombre de lignes affectées : " + nbRows);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
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

