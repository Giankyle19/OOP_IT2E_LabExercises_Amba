public class Airplane extends AirTransportation {
    private String modelName;
    private int passengerCapacity;
    private String color;
    


    public Airplane(String modelName, int passengerCapacity, String color){
       super("Airplane");
       this.modelName = modelName;
       this.color = color;
       this.passengerCapacity = passengerCapacity;
    }

    public String getModelName(){
        return modelName;
    }
    public void setModelName(String modelName){
        this.modelName = modelName;
    }

    public String getPCapacity(){
        return color;
    }
    public void setPCapacity(int paasengerCapacity){
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
