public class WaterTransportation extends Transportation {
    public WaterTransportation(String type){
        super(type);
    }
    public String displayInfo() {
        return "This is an water transportion: " + getType();
        
    }
}


