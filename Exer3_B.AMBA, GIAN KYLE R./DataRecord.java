public class DataRecord {
    private int recordId;
    private double value;

    public DataRecord(int recordId, double value) {
        super();
        this.recordId = recordId;
        this.value = value;
    }

    public int getRecordId() { return recordId; }
    public void setRecordId(int recordId) { this.recordId = recordId; }

    public double getValue() { return value; }
    public void setValue(double value) { this.value = value; }

    public void displayRecord() {
        System.out.println("Data Record ID: " + recordId + ", Value: " + value);
    }
}
