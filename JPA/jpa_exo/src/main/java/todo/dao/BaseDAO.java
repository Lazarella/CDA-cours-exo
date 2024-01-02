package todo.dao;

import java.sql.SQLException;
import java.util.List;

public abstract class BaseDAO <T>{

    public abstract boolean save(String title, String description) throws SQLException;

    public abstract boolean update(int id, String t, String d) throws SQLException;
    public abstract boolean delete(T element) throws SQLException;
    public abstract T getById(int id) throws SQLException;

    public abstract List<T> get() throws SQLException;

}
