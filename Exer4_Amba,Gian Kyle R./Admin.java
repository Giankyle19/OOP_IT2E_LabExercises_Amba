// javmodels/Admin.java
package javmodels;

public class Admin extends Person {
    private String department;
    
    public Admin(int id, String name, String email, String department) {
        super(id, name, email);
        this.department = department;
    }
    
    @Override
    public String getRole() {
        return "Administrator";
    }
    
    // Admin-specific method
    public void manageSystem() {
        System.out.println("Admin " + name + " is managing the system.");
    }
    
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
}
