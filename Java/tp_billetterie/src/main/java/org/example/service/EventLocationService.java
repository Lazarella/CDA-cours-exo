package org.example.service;

import org.example.dao.CustomerDAOImpl;
import org.example.dao.EventLocationDAO;
import org.example.exception.CustomFormatException;
import org.example.model.Customer;
import org.example.model.EventLocation;
import org.example.util.DatabaseManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class EventLocationService {
    private EventLocationDAO eventLocationDAO;
    private Connection connection;

    public EventLocationService(){
        connection = DatabaseManager.getConnection();
       eventLocationDAO = new EventLocationDAO(connection);
    }
    public boolean createEventLocation(String name,String address, int capacityMax) throws CustomFormatException {
        EventLocation eventLocation = new EventLocation();
        eventLocation.setName(name);
        eventLocation.setAddress(address);
        eventLocation.setCapacity(capacityMax);
        try {
            if (eventLocationDAO != null) {
                return eventLocationDAO.save(eventLocation);
            } else {
                throw new IllegalStateException("CustomerDAO is not initialized.");
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateCustomer(EventLocation eventLocation){
        try {
            return eventLocationDAO.update(eventLocation);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public EventLocation eventLocation(int id){
        try {
            return eventLocationDAO.get(id);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean deleteEventLocation(int id){
        EventLocation eventLocation = null;
        try {
            eventLocation = eventLocationDAO.get(id);
            if(eventLocation != null){
                return eventLocationDAO.delete(eventLocation);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public List<EventLocation> getAllLocations(){
        try {
            return eventLocationDAO.get();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void close(){
        DatabaseManager.closeConnection();
    }
}
