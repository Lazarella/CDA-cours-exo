package org.example.exo_banque.dao;

import org.example.exo_banque.model.Account;
import org.example.exo_banque.model.Client;
import org.example.exo_banque.model.Status;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionDAO extends BaseDAO {

    protected TransactionDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(Object element) throws SQLException {
        return false;
    }

    @Override
    public boolean update(Account account, double amount, Status status) throws SQLException {
        try {
            if (status == Status.DEPOT && amount > 0) {
                String request = "UPDATE account SET balance = balance + ? WHERE id = ?";
                PreparedStatement statement = _connection.prepareStatement(request);
                statement.setDouble(1, amount);
                statement.setInt(2, account.getId());

                int nbRows = statement.executeUpdate();
                return nbRows == 1;
            } else if (status == Status.RETRAIT && amount > 0 && account.getBalance() >= amount) {
                // Assurez-vous que le compte a suffisamment de fonds pour le retrait
                String request = "UPDATE account SET balance = balance - ? WHERE id = ?";
                PreparedStatement statement = _connection.prepareStatement(request);
                statement.setDouble(1, amount); // Montant du retrait
                statement.setInt(2, account.getId()); // ID du compte

                int nbRows = statement.executeUpdate();
                return nbRows == 1;
            } else {
                System.out.println("Cette opération n'est pas possible");
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    @Override
    public boolean save(Client element) throws SQLException {
        return false;
    }

    @Override
    public Object get(int id) throws SQLException {
        return null;
    }
}
