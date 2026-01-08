// javmodels/Staff.java
package javmodels;

public class Staff extends Person {
    private String position;
    private double salary;
    
    public Staff(int id, String name, String email, String position, double salary) {
        super(id, name, email);
        this.position = position;
        this.salary = salary;
    }
    
    @Override
    public String getRole() {
        return "Staff Member";
    }
    
    // Override with specialized behavior
    @Override
    public String getContactInfo() {
        return super.getContactInfo() + ", Position: " + position;
    }
    
    // Staff-specific method
    public void performDuty(String duty) {
        System.out.println("Staff " + name + " is performing: " + duty);
    }
    
    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }
    
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}
