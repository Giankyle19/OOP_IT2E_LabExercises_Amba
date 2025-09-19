public class Motorcycle extends LandTransportation {
    private String vehicleName;
    private int Capacity;
    private String plateNu;
    private String gasolineType;

    public Motorcycle(String vehicleName, int Capacity, String plateNu, String gasolineType){
        super("Motorcycle");
        this.vehicleName = vehicleName;
        this.Capacity = Capacity;
        this.plateNu = plateNu;
        this. gasolineType = gasolineType;
    }

    public String getVName(){
        return vehicleName;
    }
    public int getCapacity(){
        return Capacity;
    }
    public String getPName(){
        return plateNu;
    }
    public String getGType(){
        return gasolineType;
    }
    public void setVName(String vehicleName){
        this.vehicleName = vehicleName;
    }
    public void setCapacity(int Capacity){
        this.Capacity = Capacity;
    }
    public void setPName(String plateNu){
        this.plateNu = plateNu;
    }
    public void setGType(String gasolineType){
        this.gasolineType = gasolineType;
    }
    public String displayInfo(){
        return super.displayInfo() + " | Vehicle Name: " + vehicleName + ", Capacity: " + Capacity + ", Plate #: " + plateNu + ", Gasoline type: " + gasolineType;
    }
}
