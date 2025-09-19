public class Helicopter extends AirTransportation{
    private String modelName;
    private int passengerCapacity;
    private String color;
    
    public Helicopter(String modelName, int passengerCapacity, String color){
        super("Helicopter");
        this.modelName = modelName;
        this.passengerCapacity = passengerCapacity;
        this.color = color;
    }

    public String getMName(){
        return modelName;
    }
    public void setMName(String modelName){
        this.modelName = modelName;
    }
    public int getPCapacity(){
        return passengerCapacity;
    }
    public void setPCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String displayInfo(){
        return super.displayInfo() + " Name: " + modelName + ", Color; " + color + " Capacity: " + passengerCapacity;
    }
}


