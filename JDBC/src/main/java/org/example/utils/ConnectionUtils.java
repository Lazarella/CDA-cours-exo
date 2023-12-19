package org.example.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
    public static Connection getMySQLConnection() throws SQLException {
        // avec MYSQL
        String url = "jdbc:mysql://localhost:3306/demo_jdbc";

        String userName = "root";
        String password = "r4diX!";


        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            if (connection != null) {
                System.out.println("Connexion ok ok !");
            } else {
                System.out.println("Connexion NOT not ok ");
            }
            return connection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
}