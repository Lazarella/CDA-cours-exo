package org.example.dao;

import org.example.model.Customer;
import org.example.model.Ticket;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl extends BaseDAO<Customer> {

    public CustomerDAOImpl(Connection connection){super(connection);}
    @Override
    public boolean save(Customer element) throws SQLException {
        request = "INSERT INTO customer (first_name, last_name, mail ) VALUES (?,?,?)";
        stmt = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        stmt.setString(1, element.getFirstname());
        stmt.setString(2, element.getLastname());
        stmt.setString(3, element.getEmail());
        int nbRows = stmt.executeUpdate();
        resultSet = stmt.getGeneratedKeys();
        if(resultSet.next()){
            element.setId(resultSet.getInt(1));
        }
        System.out.println("Bienvenue dans notre super billetterie™ "+element.getFirstname()+" "+ element.getLastname());
        return nbRows == 1;
    }

    @Override
    public boolean update(Customer element) throws SQLException {
        request = "UPDATE customer SET first_name = ?, last_name = ? WHERE id = ?";
        stmt = _connection.prepareStatement(request);
        stmt.setString(1, element.getFirstname());
        stmt.setString(2, element.getLastname());
        stmt.setString(3, element.getEmail());
        int nbRow = stmt.executeUpdate();
        return nbRow == 1;
    }

    @Override
    public boolean delete(Customer element) throws SQLException {
        request = "DELETE customer WHERE id = ?";
        stmt = _connection.prepareStatement(request);
        stmt.setInt(1, element.getId());
        int nbRow = stmt.executeUpdate();
        return false;
    }

    @Override
    public Customer get(int id) throws SQLException {
        Customer customer = null;
        request = "SELECT * fROM customer WHERE id = ?";
        stmt = _connection.prepareStatement(request);
        stmt.setInt(1, id);
        resultSet = stmt.executeQuery();
        if(resultSet.next()){
            customer = new Customer (resultSet.getInt("id"),
                    resultSet.getString("first_name"),
                    resultSet.getString("last_name"),
                    resultSet.getString("mail"));
        }
        return customer;
    }

    @Override
    public List<Customer> get() throws SQLException {
        List<Customer> result = new ArrayList<>();
        request = "SELECT * FROM customer";
        stmt = _connection.prepareStatement(request);
        resultSet = stmt.executeQuery();
        while (resultSet.next()){
            Customer customer = new Customer (resultSet.getInt("id"),
                    resultSet.getString("first_name"),
                    resultSet.getString("last_name"),
                    resultSet.getString("mail"));
            result.add(customer);
        }
        return result;
    }
}
