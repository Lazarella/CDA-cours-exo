package org.example.exo_banque.service;

import org.example.exoPerson.utils.DatabaseManager;
import org.example.exo_banque.dao.ClientDAO;
import org.example.exo_banque.model.Client;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ClientService {
    private ClientDAO clientDAO;
    private Connection connection;

    public ClientService(){
        try {
            connection = new DatabaseManager().getConnection();
            clientDAO = new ClientDAO(connection);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public boolean createClient(String firstName,String lastName, String telephone){
       Client client = new Client(firstName, lastName, telephone);
        client.setFirstName(firstName);
        client.setLastName(lastName);
        client.setTelephone(telephone);
        try {
            return clientDAO.save(client);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public Client getClient(int id){
        try {
            return ClientDAO.get(id);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
