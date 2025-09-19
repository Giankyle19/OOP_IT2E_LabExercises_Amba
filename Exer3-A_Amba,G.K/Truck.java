public class Truck extends LandTransportation{
    private String modelName;
    private String passengerCapacity;
    private String engineType;
    private String plateNu;
    
    public Truck(String modelName, String passengerCapacity, String engineType, String plateNu){
        super("Truck");
        this.modelName = modelName;
        this.passengerCapacity = passengerCapacity;
        this.engineType = engineType;
        this.plateNu = plateNu;
    }

    public String getName(){
        return modelName;
    }
    public String getPCapacity(){
        return passengerCapacity;
    }
    public String getEType(){
        return engineType;
    }
    public String plateNu(){
        return plateNu;
    }
    public void setName(String modelName){
        this.modelName = modelName;
    }
    public void setPCapacity(String passengerCapacity){
        this.passengerCapacity = passengerCapacity;
    }
    public void setEType(String engineType){
        this.engineType = engineType;
    }
    public void setPNumber(String plateNu){
        this.plateNu = plateNu;
    }

    public String displayInfo(){
        return super.displayInfo() + " , Truck Name: " + modelName + " Capacity: " + passengerCapacity + " Engine Type: " + engineType + " Plate Number: " + plateNu;
    }
}
