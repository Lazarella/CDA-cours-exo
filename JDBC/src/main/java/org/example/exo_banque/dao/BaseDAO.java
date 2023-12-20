package org.example.exo_banque.dao;

import org.example.exo_banque.model.Account;
import org.example.exo_banque.model.Client;
import org.example.exo_banque.model.Status;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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


    public abstract T get(int id) throws SQLException;

    }
}
