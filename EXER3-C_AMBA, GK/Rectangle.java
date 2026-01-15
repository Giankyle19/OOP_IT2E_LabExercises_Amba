public class Rectangle extends Shape {
    private float length;
    private float width; 

    public Rectangle(float length, float width){
        super();
        this.length = length;
        this.width = width;

    }

    public float getLength(float length) {
        return this.length;
    }

    public float getWidth(float width){
        return this.width;
    }
        public void setLength(float length){
            this.length = length;
        }    

        public void setWidth(float width){
            this.width = width;
        }

        public float calculateArea(){
            return length * width;

        }


        public String displayArea() {
            return "Rectangle with the length: " + length + ", width: " + width +", area: " + calculateArea();
        }
    
}
