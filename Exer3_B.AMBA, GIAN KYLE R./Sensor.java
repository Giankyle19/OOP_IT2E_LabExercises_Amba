public class Sensor {
    private int sensorId;
    private String type;

    public Sensor(int sensorId, String type) {
        super();
        this.sensorId = sensorId;
        this.type = type;
    }

    public int getSensorId() { return sensorId; }
    public void setSensorId(int sensorId) { this.sensorId = sensorId; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public void readData() {
        System.out.println("Sensor [" + sensorId + "] of type " + type + " is reading data...");
    }
}
