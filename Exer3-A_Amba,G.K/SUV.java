public class SUV extends LandTransportation {
    private String modelName;
    private int paasengerCapacity;
    private String engineType;
    private String plateNu;

    public SUV(String modelName, int passengerCapacity, String engineType, String plateNu){
        super("SUV");
        this.modelName = modelName;
        this.paasengerCapacity = passengerCapacity;
        this.engineType = engineType;
        this.plateNu = plateNu;
    }
    public String getSUVName(){
        return modelName;
    }
    public int getPCapacity(){
        return paasengerCapacity;
    }
    public String getEType(){
        return engineType;
    }
    public String plateNu(){
        return plateNu;
    }
    public void setSUVName(String modelName){
        this.modelName = modelName;
    }
    public void setPCapacity(int passengerCapacity){
        this.paasengerCapacity = passengerCapacity;
    }
    public void setEType(String engineType){
        this.engineType = engineType;
    }
    public void setPNumber(String plateNu){
        this.plateNu = plateNu;
    }
    public String displayInfo(){
        return super.displayInfo() + " | Name: " + modelName + ", Capacity: " + paasengerCapacity + ", Engine Type: " + engineType + ", Plate Number: "
        + plateNu;
    }
}

