public class AirTransportation extends Transportation {
    public AirTransportation(String type){
        super(type);
    }
    public String displayInfo() {
        return "This is an air transportion: " + getType();
        
    }
}


