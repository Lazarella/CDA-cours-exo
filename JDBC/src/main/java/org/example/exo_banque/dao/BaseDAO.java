package org.example.exo_banque.dao;

import org.example.exo_banque.model.Account;
import org.example.exo_banque.model.Client;
import org.example.exo_banque.model.Status;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public abstract class BaseDAO<T> {
    protected Connection _connection;
    protected PreparedStatement statement;
    protected String request;
    protected ResultSet resultSet;

    protected BaseDAO(Connection connection){
        _connection = connection;
    }

    public abstract boolean save(T element) throws SQLException;

    public abstract boolean update(T element) throws SQLException;

    public abstract boolean deposit(Account account, double amount) throws SQLException;

    public abstract boolean update(Account account, double amount, Status status) throws SQLException;

    public abstract boolean save(Client element) throws SQLException;

    public abstract boolean update(Account element) throws SQLException;

    public abstract boolean save(Account element) throws SQLException;

    public abstract T get(int id) throws SQLException;

    //public abstract List<T> get() throws SQLException;
}
