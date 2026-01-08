// javmodels/Resource.java
package javmodels;

public interface Resource {
    // Interface methods (no implementation)
    String getName();
    void setName(String name);
    
    int getQuantity();
    void setQuantity(int quantity);
    
    String getResourceType();
    double calculateValue(); // Different implementations for different resources
}
