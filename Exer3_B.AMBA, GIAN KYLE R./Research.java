public class Researcher extends User {
    private String fieldOfStudy;

    public Researcher(int id, String name, String fieldOfStudy) {
        super(id, name);
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getFieldOfStudy() {
      return fieldOfStudy; 
    }
    public void setFieldOfStudy(String fieldOfStudy) { 
      this.fieldOfStudy = fieldOfStudy; 
    }


    public void displayInfo() {
        System.out.println("Researcher: " + getName() + " (Field: " + fieldOfStudy + ")");
    }
}
