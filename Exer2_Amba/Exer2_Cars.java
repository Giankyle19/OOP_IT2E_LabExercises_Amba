public class Cars {
    private String plateNo;
    private String chassisNo;
    private String color;
    private String engineType;
    private String brandName;
    private String customName;

    public Cars(){
        this.color = "No Color";
        this.plateNo = "No PlateNumber";
        this.chassisNo = "No Chassis yet";
        this.engineType = "V6 engine";
        this.brandName = "Toyota";
        this.customName = "Hilux";


}
public Cars(String color, String plateNo, String chassisNO, String engineType, String brandName, String customName ) {
    this.color = color;
    this.plateNo = plateNo;
    this.chassisNo = chassisNO;
    this.engineType = engineType;
    this.brandName = brandName;
    this.customName = customName;

}

public void displayInfo(){
    String info = " ";
    info += "\nColor: " + this.color;
    info += "\nPlateNo: " + this.plateNo;
    info += "\nChassisNo: " + this.chassisNo;
    info += "\nEngineType: " + this.engineType;
    info += "\nBrandName: " + this.brandName;
    info += "\nCustom/ModelName: " + this.customName;
    System.out.println(info);

}
    }
