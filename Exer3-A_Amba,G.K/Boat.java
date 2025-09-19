public class Boat extends WaterTransportation{
    private String weight;
    private String color;
    private int pCapacity;
   

    public Boat(String weight, String color, int pCapacity){
        super("Boat");
        this.weight = weight;
        this.color = color;
        this.pCapacity = pCapacity;
    }

    public String getWeight(){
        return weight;
    }
    public void setWeight(String weight){
        this.weight = weight;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public int getPCapacity(){
        return pCapacity;
    }
    public void setPCapacity(int pCapacity){
        this.pCapacity = pCapacity;
    }
   

    public String displayInfo(){
        return super.displayInfo() + " Weight: " + weight + ", Color; " + color + " Capacity: " + pCapacity;
    }
}
