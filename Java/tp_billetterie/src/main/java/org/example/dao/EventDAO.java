package org.example.dao;

import org.example.model.Event;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class EventDAO extends BaseDAO<Event> {
    protected EventDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(Event element) throws SQLException {
        return false;
    }

    @Override
    public boolean update(Event element) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(Event element) throws SQLException {
        return false;
    }

    @Override
    public Event get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Event> get() throws SQLException {
        return null;
    }
}
