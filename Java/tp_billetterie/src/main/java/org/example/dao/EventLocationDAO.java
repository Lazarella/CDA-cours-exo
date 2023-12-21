package org.example.dao;

import org.example.model.Customer;
import org.example.model.EventLocation;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EventLocationDAO extends BaseDAO<EventLocation> {
    public EventLocationDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(EventLocation element) throws SQLException {
        request = "INSERT INTO customer (name_location, address_location, capacity ) VALUES (?,?,?)";
        stmt = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        stmt.setString(1, element.getName());
        stmt.setString(2, element.getAddress());
        stmt.setInt(3, element.getCapacity());
        int nbRows = stmt.executeUpdate();
        resultSet = stmt.getGeneratedKeys();
        if (resultSet.next()) {
            element.setId(resultSet.getInt(1));
        }
        System.out.println(element.getName() + " fait partie de la base de données");
        return nbRows == 1;
    }

        @Override
        public boolean update (EventLocation element) throws SQLException {
            request = "UPDATE customer SET name_location = ?, adress_location = ?, capacity = ? WHERE id = ?";
            stmt = _connection.prepareStatement(request);
            stmt.setString(1, element.getName());
            stmt.setString(2, element.getAddress());
            stmt.setInt(3, element.getCapacity());
            int nbRow = stmt.executeUpdate();
            return nbRow == 1;
        }

        @Override
        public boolean delete (EventLocation element) throws SQLException {
            request = "DELETE event_location WHERE id = ?";
            stmt = _connection.prepareStatement(request);
            stmt.setInt(1, element.getId());
            int nbRow = stmt.executeUpdate();
            return false;
        }

        @Override
        public EventLocation get ( int id) throws SQLException {
            EventLocation eventLocation = null;
            request = "SELECT * fROM customer WHERE id = ?";
            stmt = _connection.prepareStatement(request);
            stmt.setInt(1, id);
            resultSet = stmt.executeQuery();
            if(resultSet.next()){
                eventLocation = new EventLocation (resultSet.getInt("id"),
                        resultSet.getString("name_location"),
                        resultSet.getString("address_location"),
                        resultSet.getInt("capacity"));
            }
            return eventLocation;
        }

        @Override
        public List<EventLocation> get () throws SQLException {
            List<EventLocation> result = new ArrayList<>();
            request = "SELECT * FROM event_location";
            stmt = _connection.prepareStatement(request);
            resultSet = stmt.executeQuery();
            while (resultSet.next()){
                EventLocation eventLocation = new EventLocation (resultSet.getInt("id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getInt("cpacity"));
                result.add(eventLocation);
            }
            return result;
        }
    }

