// test/OOPTest.java
package test;

import javmodels.*;
import dao.MarineResourceDAO;
import java.util.List;

public class OOPTest {
    public static void main(String[] args) {
        // POLYMORPHISM - Same type, different behaviors
        Person admin = new Admin(1, "John Admin", "john@aquaguard.com", "IT");
        Person staff = new Staff(2, "Jane Staff", "jane@aquaguard.com", "Manager", 50000);
        Person researcher = new Researcher(3, "Bob Researcher", "bob@aquaguard.com", 
                                          "Marine Biology", "PhD");
        
        Person[] people = {admin, staff, researcher};
        
        System.out.println("=== POLYMORPHISM DEMONSTRATION ===");
        for (Person person : people) {
            System.out.println(person.getRole() + ": " + person.getName());
            System.out.println("Contact: " + person.getContactInfo());
            System.out.println();
        }
        
        // INTERFACE IMPLEMENTATION
        System.out.println("=== INTERFACE DEMONSTRATION ===");
        Resource marine = new MarineResource(1, "Bluefin Tuna", "Fish", 500, 100.0);
        Resource equipment = new EquipmentResource(2, "Research Boat", "Vehicle", 3, 50000.0, 10);
        
        Resource[] resources = {marine, equipment};
        
        for (Resource resource : resources) {
            System.out.println("Resource: " + resource.getName());
            System.out.println("Type: " + resource.getResourceType());
            System.out.println("Value: $" + resource.calculateValue());
            System.out.println();
        }
        
        // DAO PATTERN WITH INHERITANCE
        System.out.println("=== DAO PATTERN DEMONSTRATION ===");
        MarineResourceDAO marineDAO = new MarineResourceDAO();
        
        // Using template method from parent class
        MarineResource newResource = new MarineResource(0, "Coral Reef", "Coral", 200, 50.0);
        boolean saved = marineDAO.save(newResource); // Calls template method
        
        System.out.println("Resource saved: " + saved);
        System.out.println("New ID: " + newResource.getId());
        
        // Reading all resources
        List<MarineResource> allResources = marineDAO.readAll();
        System.out.println("\nAll Marine Resources:");
        for (MarineResource res : allResources) {
            System.out.println(res.getName() + " - " + res.getQuantity() + " units");
        }
    }
}
