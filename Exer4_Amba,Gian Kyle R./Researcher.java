// javmodels/Researcher.java
package javmodels;

public class Researcher extends Person {
    private String researchArea;
    private String qualification;
    
    public Researcher(int id, String name, String email, String researchArea, String qualification) {
        super(id, name, email);
        this.researchArea = researchArea;
        this.qualification = qualification;
    }
    
    @Override
    public String getRole() {
        return "Researcher";
    }
    
    // Researcher-specific method
    public void conductResearch() {
        System.out.println("Researcher " + name + " is conducting research in " + researchArea);
    }
    
    public String getResearchArea() { return researchArea; }
    public void setResearchArea(String researchArea) { this.researchArea = researchArea; }
    
    public String getQualification() { return qualification; }
    public void setQualification(String qualification) { this.qualification = qualification; }
}
