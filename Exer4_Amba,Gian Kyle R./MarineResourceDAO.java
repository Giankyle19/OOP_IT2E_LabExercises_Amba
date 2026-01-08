// dao/MarineResourceDAO.java
package dao;

import javmodels.MarineResource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MarineResourceDAO extends DAO<MarineResource> {
    
    @Override
    public boolean create(MarineResource resource) {
        String sql = "INSERT INTO marine_resources (name, type, quantity, unit_value) VALUES (?, ?, ?, ?)";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, resource.getName());
            stmt.setString(2, resource.getType());
            stmt.setInt(3, resource.getQuantity());
            stmt.setDouble(4, resource.getUnitValue());
            
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                ResultSet rs = stmt.getGeneratedKeys();
                if (rs.next()) {
                    resource.setId(rs.getInt(1));
                }
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    @Override
    public MarineResource read(int id) {
        String sql = "SELECT * FROM marine_resources WHERE id = ?";
        MarineResource resource = null;
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                resource = new MarineResource(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("type"),
                    rs.getInt("quantity"),
                    rs.getDouble("unit_value")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resource;
    }
    
    @Override
    public List<MarineResource> readAll() {
        List<MarineResource> resources = new ArrayList<>();
        String sql = "SELECT * FROM marine_resources ORDER BY name";
        
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                MarineResource resource = new MarineResource(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("type"),
                    rs.getInt("quantity"),
                    rs.getDouble("unit_value")
                );
                resources.add(resource);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resources;
    }
    
    @Override
    public boolean update(MarineResource resource) {
        String sql = "UPDATE marine_resources SET name = ?, type = ?, quantity = ?, unit_value = ? WHERE id = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, resource.getName());
            stmt.setString(2, resource.getType());
            stmt.setInt(3, resource.getQuantity());
            stmt.setDouble(4, resource.getUnitValue());
            stmt.setInt(5, resource.getId());
            
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    @Override
    public boolean delete(int id) {
        String sql = "DELETE FROM marine_resources WHERE id = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    @Override
    protected boolean exists(MarineResource resource) {
        return resource.getId() > 0 && read(resource.getId()) != null;
    }
    
    // MarineResourceDAO-specific method
    public List<MarineResource> findByType(String type) {
        List<MarineResource> resources = new ArrayList<>();
        String sql = "SELECT * FROM marine_resources WHERE type = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, type);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                MarineResource resource = new MarineResource(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("type"),
                    rs.getInt("quantity"),
                    rs.getDouble("unit_value")
                );
                resources.add(resource);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resources;
    }
}
