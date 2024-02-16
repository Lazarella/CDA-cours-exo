package todo.dao;

import java.sql.SQLException;
import java.util.List;

public abstract class BaseDAO <T>{

    public abstract boolean save(T element) throws Exception;

    public abstract boolean update(int id, String t, String d) throws Exception;
    public abstract boolean delete(int id) throws Exception;
    public abstract T getById(int id) throws Exception;


    public abstract void isDone(T element, T e);

    public abstract void isDone(Long id, boolean done);

    public abstract List<T> get() throws Exception;

}
