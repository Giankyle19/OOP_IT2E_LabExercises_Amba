public class WaterQuality extends MarineResource {
    private double phLevel;

    public WaterQuality(String name, int quantity, double phLevel) {
        super(name, quantity);
        this.phLevel = phLevel;
    }

    public double getPhLevel() { return phLevel; }
    public void setPhLevel(double phLevel) { this.phLevel = phLevel; }


    public void describeResource() {
        System.out.println("Water Quality: " + getName() + ", pH Level: " + phLevel);
    }
}
