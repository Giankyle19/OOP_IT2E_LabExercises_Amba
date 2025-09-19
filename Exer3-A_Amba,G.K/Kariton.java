public class Kariton extends LandTransportation {
    private String weight;
    private String load;
    private String owner;
    
    public Kariton(String weight, String load, String owner){
        super("Kariton");
        this. weight = weight;
        this. load = load;
        this. owner = owner;
    }

    public String getWeight(){
        return weight;
    }
    public String getLoad(){
        return load;
    }
    public String getOwner(){
        return owner;
    }
    public void setWeight(String weight){
        this.weight = weight;
    }
    public void setLoad(String load){
        this.load = load;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }
    public String displayInfo(){
        return super.displayInfo() + " | Owner: " + owner + ", Load: " + load + ", Weight: " + weight;
    }
}

