// javmodels/EquipmentResource.java
package javmodels;

public class EquipmentResource implements Resource {
    private int id;
    private String name;
    private String category;
    private int quantity;
    private double purchasePrice;
    private int usefulLifeYears;
    
    public EquipmentResource(int id, String name, String category, int quantity, 
                            double purchasePrice, int usefulLifeYears) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.purchasePrice = purchasePrice;
        this.usefulLifeYears = usefulLifeYears;
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
    public String getResourceType() { return "Equipment: " + category; }
    
    @Override
    public double calculateValue() {
        // Equipment depreciates over time
        double depreciation = purchasePrice * 0.1 * usefulLifeYears;
        return (purchasePrice - depreciation) * quantity;
    }
    
    // Equipment-specific method
    public double getAnnualDepreciation() {
        return purchasePrice / usefulLifeYears;
    }
    
    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    
    public double getPurchasePrice() { return purchasePrice; }
    public void setPurchasePrice(double purchasePrice) { this.purchasePrice = purchasePrice; }
    
    public int getUsefulLifeYears() { return usefulLifeYears; }
    public void setUsefulLifeYears(int usefulLifeYears) { this.usefulLifeYears = usefulLifeYears; }
}
