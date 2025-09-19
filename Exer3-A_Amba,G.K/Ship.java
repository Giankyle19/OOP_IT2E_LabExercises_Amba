public class Ship extends WaterTransportation{
    private String shipName;
    private String color;
    private int pCapacity;
    private double load;
    private String typeShip;

    public Ship(String shipName, String color, int pCapacity, double load, String typeShip){
        super("Ship");
        this.shipName = shipName;
        this.color = color;
        this.pCapacity = pCapacity;
        this.load = load;
        this.typeShip = typeShip;
    }

    public String getSName(){
        return shipName;
    }
    public void setSName(String shipName){
        this.shipName = shipName;
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
    public double getLoad(){
        return load;
    }
    public void setLoad(double load){
        this.load = load;
    }
    public String getTShip(){
        return typeShip;
    }
    public void setTShip(String typeShip){
        this.typeShip = typeShip;
    }

    public String displayInfo(){
        return super.displayInfo() + " Type: " + typeShip + " Name: " + shipName + ", Color; " + color + " Capacity: " + pCapacity + " Load: " + load;
    }
}
