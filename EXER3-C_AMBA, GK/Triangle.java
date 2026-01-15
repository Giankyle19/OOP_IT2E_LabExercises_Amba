public class Triangle extends Shape {
    private float sideA;
    private float sideB;
    private float sideC;

    public Triangle(float sideA, float sideB, float sideC) {
        super();
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    
    public float getSideA(){
        return sideA;
    }
    public float getSideB(){
        return sideB;
    }
    public float getSideC(){
        return sideC;
    }
    public void setSideA(float sideA){
        this.sideA = sideA;
    }
    public void setSideB(float sideB){
        this.sideA = sideB;
    }
    public void setSideC(float sideC){
        this.sideA = sideC;
    }
    
    public float calculateArea(){
        float s = (sideA + sideB + sideC)/2;
        return (float) Math.sqrt(s * (s - sideA) * (s - sideB) * (s-sideC));
    }

    public String displayArea() {
        return "Triangle with sides: " + sideA + ", " + sideB + ", " + sideC + ", area: " + calculateArea();
        
    }


}
