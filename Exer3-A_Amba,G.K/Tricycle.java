public class Tricycle extends LandTransportation {
    private String vehicleName;
    private int passengerCapacity;
    private double weight;
    private String plateNu;

    public Tricycle(String vehicleName, int passengerCapacity, double weight, String plateNu){
        super("Tricycle");
        this.vehicleName = vehicleName;
        this.passengerCapacity = passengerCapacity;
        this.weight = weight;
        this.plateNu = plateNu;
    }
    public String getVName(){
        return vehicleName;
    }
    public int getPCapacity(){
        return passengerCapacity;
    }
    public double weight(){
        return weight;
    }
    public String getPNu(){
        return plateNu;
    }
    public void setSUVName(String vehicleName){
        this.vehicleName = vehicleName;
    }
    public void setPCapacity(int passengerCapacity){
        this.passengerCapacity = passengerCapacity;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setPNu(String plateNu){
        this.plateNu = plateNu;
    }

    public String displayInfo(){
        return super.displayInfo() + " | Vehicle Name: " + vehicleName + ", Capacity: " + passengerCapacity + ", Weight: " + weight + "lbs , Plate #: " + plateNu;
    }
}
