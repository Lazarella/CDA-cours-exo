package org.example.exo_banque.dao;

import org.example.exo_banque.model.Account;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class AccountDAO extends BaseDAO {

    public AccountDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean update(Account element) throws SQLException {
        request = "UPDATE account SET balance = ? WHERE id = ?";
        statement = _connection.prepareStatement(request);
        statement.setDouble(1, element.getBalance());
        int nbRows = statement.executeUpdate();
        return nbRows == 1;
    }

    @Override
    public boolean save(Account element) throws SQLException {
        request = "INSERT INTO account (client_id, balance) VALUES (?,?)";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setInt(1, element.get_clientId());
        statement.setDouble(2, element.getBalance());
        int nbRows = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        if (resultSet.next()) {
            element.setId(resultSet.getInt(1));
        }
        return nbRows == 1;
    }

    @Override
    public Account get(int id) throws SQLException {
        Account account = null;
        request = "Select * INTO account WHERE id = ? ";
        statement = _connection.prepareStatement(request);
        statement.setInt(1, id);
        resultSet = statement.executeQuery();
        if(resultSet.next()){
            account = new Account(resultSet.getInt("id"),
                    resultSet.getDouble("balance"));
        }
        return person;

    public List<Account> get_clientId() {

        return _clientId;
    }
}

