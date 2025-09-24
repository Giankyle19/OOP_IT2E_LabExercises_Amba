public class AquaGuardTester {
    public static void main(String[] args) {

        System.out.println("=== AquaGuard ===");
        System.out.println();
        System.out.println("=== USER MANAGEMENT ===");
        User u = new User(1, "Alice");
        Admin a = new Admin(2, "Bob", 5);
        Researcher r = new Researcher(3, "Charlie", "Marine Biology");
        u.displayInfo();
        a.displayInfo();
        r.displayInfo();

        System.out.println("\n=== MARINE RESOURCES ===");
        Fish f = new Fish("Tuna", 100, "Bluefin");
        Coral c = new Coral("Great Barrier Reef Coral", 50, "Staghorn");
        WaterQuality w = new WaterQuality("Seawater Sample", 1, 7.8);
        ConservationPlan cp = new ConservationPlan("Protect Coral Reefs");
        f.describeResource();
        c.describeResource();
        w.describeResource();
        cp.showPlanDetails();

        System.out.println("\n=== MONITORING & REPORTS ===");
        Sensor s = new Sensor(101, "Temperature");
        DataRecord dr = new DataRecord(5001, 23.5);
        Report rep = new Report("Monthly Marine Health");
        s.readData();
        dr.displayRecord();
        rep.generateReport();

        System.out.println("\n=== SUSTAINABILITY MODULE ===");
        EcoPolicy ep = new EcoPolicy("Ban Plastic Waste");
        SustainabilityGoal sg = new SustainabilityGoal("Reduce ocean pollution by 50% in 5 years");
        ep.enforcePolicy();
        sg.trackProgress();
    }
}
