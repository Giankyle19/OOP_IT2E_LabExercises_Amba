// dao/DAO.java
package dao;

import java.sql.Connection;
import java.util.List;

public abstract class DAO<T> {
    protected Connection connection;
    
    public DAO() {
        this.connection = database.DBConnect.getConnection();
    }
    
    // CRUD operations - must be implemented by subclasses
    public abstract boolean create(T obj);
    public abstract T read(int id);
    public abstract List<T> readAll();
    public abstract boolean update(T obj);
    public abstract boolean delete(int id);
    
    // Template method pattern - defines algorithm skeleton
    public final boolean save(T obj) {
        boolean success = false;
        try {
            if (exists(obj)) {
                success = update(obj);
            } else {
                success = create(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
            success = false;
        }
        return success;
    }
    
    // Hook method - can be overridden by subclasses
    protected boolean exists(T obj) {
        return false; // Default implementation
    }
    
    // Common utility method for all DAOs
    protected void closeResources(AutoCloseable... resources) {
        for (AutoCloseable resource : resources) {
            if (resource != null) {
                try {
                    resource.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
