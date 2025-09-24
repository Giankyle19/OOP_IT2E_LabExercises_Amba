public class Coral extends MarineResource {
    private String type;

    public Coral(String name, int quantity, String type) {
        super(name, quantity);
        this.type = type;
    }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public void describeResource() {
        System.out.println("Coral: " + getName() + ", Type: " + type + ", Quantity: " + getQuantity());
    }
}
