public class Circle extends Shape {

    private float radius;
    final float PI = 3.15f;

    public Circle(float radius){
        super();
        this.radius = radius;

    }

    public float calculateArea(){
        float cArea = PI * (radius * radius);
        return cArea;
    }

    public String displayArea(){
        return "This area of a circle have a radius of " + this.radius + " is " + this.calculateArea();

    }

    public void setRadius(float radius){
        this.radius = radius;

        }

    public float getRadius(){
        return this.radius;
    }
}
