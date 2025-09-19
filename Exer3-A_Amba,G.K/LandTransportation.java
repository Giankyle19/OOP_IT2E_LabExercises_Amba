public class LandTransportation extends Transportation {
    public LandTransportation(String type){
        super(type);
    }
    public String displayInfo() {
        return "This is an land transportation: " + getType();
        
    }
}


