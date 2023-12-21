package org.example.service;

import org.example.dao.CustomerDAOImpl;
import org.example.exception.CustomFormatException;
import org.example.model.Customer;
import org.example.util.DatabaseManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CustomerService {
    private  CustomerDAOImpl customerDAO;
    private Connection connection;

    public CustomerService(){
        connection = DatabaseManager.getConnection();
        customerDAO = new CustomerDAOImpl(connection);
    }
    public boolean createCustomer(String firstName,String lastName, String email) throws CustomFormatException {
        Customer customer = new Customer();
        customer.setFirstname(firstName);
        customer.setLastname(lastName);
        customer.setEmail(email);
                try {
                    if (customerDAO != null) {
                        return customerDAO.save(customer);
                    } else {
                        throw new IllegalStateException("CustomerDAO is not initialized.");
                    }
                }catch (SQLException e) {
                    throw new RuntimeException(e);
                }
        }

    public boolean updateCustomer(Customer customer){
        try {
            return customerDAO.update(customer);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Customer getCustomer(int id){
        try {
            return customerDAO.get(id);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean deleteCustomer(int id){
        Customer customer = null;
        try {
            customer = customerDAO.get(id);
            if(customer != null){
                return customerDAO.delete(customer);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public List<Customer> getAllPersons(){
        try {
            return customerDAO.get();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void close(){
        DatabaseManager.closeConnection();
    }
}
