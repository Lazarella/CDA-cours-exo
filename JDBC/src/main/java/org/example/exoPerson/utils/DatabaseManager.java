package org.example.exoPerson.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private final String URI = "jdbc:mysql://localhost:3306/demo_jdbc";
    private final String USER = "root";
    private final String PASSWORD = "r4diX!";

        public Connection getConnection() throws SQLException {
            return DriverManager.getConnection(URI,USER,PASSWORD);
        }

}
