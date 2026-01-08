// javmodels/MarineResource.java
package javmodels;

public class MarineResource implements Resource {
    private int id;
    private String name;
    private String type;
    private int quantity;
    private double unitValue;
    
    public MarineResource(int id, String name, String type, int quantity, double unitValue) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        this.unitValue = unitValue;
    }
    
    @Override
    public String getName() { return name; }
    
    @Override
    public void setName(String name) { this.name = name; }
    
    @Override
    public int getQuantity() { return quantity; }
    
    @Override
    public void setQuantity(int quantity) { this.quantity = quantity; }
    
    @Override
    public String getResourceType() { return "Marine: " + type; }
    
    @Override
    public double calculateValue() {
        return quantity * unitValue * 1.1; // Marine resources have 10% premium
    }
    
    // MarineResource-specific methods
    public String getConservationStatus() {
        if (quantity < 100) return "Endangered";
        else if (quantity < 500) return "Vulnerable";
        else return "Stable";
    }
    
    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    
    public double getUnitValue() { return unitValue; }
    public void setUnitValue(double unitValue) { this.unitValue = unitValue; }
}
