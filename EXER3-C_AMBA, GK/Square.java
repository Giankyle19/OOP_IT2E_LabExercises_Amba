public class Square extends Shape {
    private float side;

    public Square(float side){
        super();
        this.side = side;
    }
    public void setSide(float side){
        this.side = side;
    }    

    public float getSide(){
        return this.side;
    }


    public String displayArea() {
        return "The square side is:";
    }

}
