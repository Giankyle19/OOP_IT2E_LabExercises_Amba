public class Transportation {
    private String type;

    public Transportation(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }
    public String displayInfo(){
        return "This is a transportation type: " + type;
    }
}
