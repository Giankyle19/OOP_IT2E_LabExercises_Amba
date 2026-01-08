// dao/UserDAO.java
package dao;

import javmodels.Person;
import javmodels.Admin;
import javmodels.Staff;
import javmodels.Researcher;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO extends DAO<Person> {
    
    @Override
    public boolean create(Person person) {
        String sql = "INSERT INTO users (name, email, role, department, position, salary, research_area, qualification) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, person.getName());
            stmt.setString(2, person.getEmail());
            
            // Set common parameters
            if (person instanceof Admin) {
                Admin admin = (Admin) person;
                stmt.setString(3, "admin");
                stmt.setString(4, admin.getDepartment());
                stmt.setString(5, null);
                stmt.setNull(6, Types.DOUBLE);
                stmt.setString(7, null);
                stmt.setString(8, null);
            } else if (person instanceof Staff) {
                Staff staff = (Staff) person;
                stmt.setString(3, "staff");
                stmt.setString(4, null);
                stmt.setString(5, staff.getPosition());
                stmt.setDouble(6, staff.getSalary());
                stmt.setString(7, null);
                stmt.setString(8, null);
            } else if (person instanceof Researcher) {
                Researcher researcher = (Researcher) person;
                stmt.setString(3, "researcher");
                stmt.setString(4, null);
                stmt.setString(5, null);
                stmt.setNull(6, Types.DOUBLE);
                stmt.setString(7, researcher.getResearchArea());
                stmt.setString(8, researcher.getQualification());
            }
            
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                ResultSet rs = stmt.getGeneratedKeys();
                if (rs.next()) {
                    person.setId(rs.getInt(1));
                }
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    @Override
    public Person read(int id) {
        String sql = "SELECT * FROM users WHERE id = ?";
        Person person = null;
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                String role = rs.getString("role");
                
                switch (role) {
                    case "admin":
                        person = new Admin(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("email"),
                            rs.getString("department")
                        );
                        break;
                    case "staff":
                        person = new Staff(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("email"),
                            rs.getString("position"),
                            rs.getDouble("salary")
                        );
                        break;
                    case "researcher":
                        person = new Researcher(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("email"),
                            rs.getString("research_area"),
                            rs.getString("qualification")
                        );
                        break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return person;
    }
    
    @Override
    public List<Person> readAll() {
        List<Person> persons = new ArrayList<>();
        String sql = "SELECT * FROM users ORDER BY name";
        
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                String role = rs.getString("role");
                Person person = null;
                
                switch (role) {
                    case "admin":
                        person = new Admin(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("email"),
                            rs.getString("department")
                        );
                        break;
                    case "staff":
                        person = new Staff(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("email"),
                            rs.getString("position"),
                            rs.getDouble("salary")
                        );
                        break;
                    case "researcher":
                        person = new Researcher(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("email"),
                            rs.getString("research_area"),
                            rs.getString("qualification")
                        );
                        break;
                }
                
                if (person != null) {
                    persons.add(person);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return persons;
    }
    
    // Other methods similarly implemented...
}
