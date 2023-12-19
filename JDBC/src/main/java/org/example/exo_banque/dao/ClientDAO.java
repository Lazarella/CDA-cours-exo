package org.example.exo_banque.dao;

import org.example.exo_banque.model.Client;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientDAO extends BaseDAO{


    public ClientDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(Client element) throws SQLException {
        request =  "INSERT INTO clients (first_name, last_name, telephone) VALUES (?,?,?)";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, element.getFirstName());
        statement.setString(2, element.getLastName());
        statement.setString(3, element.getTelephone());
        int nbRows = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        if(resultSet.next()){
            element.setId(resultSet.getInt(1));
        }
        return nbRows == 1;
    }

    @Override
    public Object get(int id) throws SQLException {
        return null;
    }

}
