public class ConservationPlan {
    private String planName;

    public ConservationPlan(String planName) {
        super();
        this.planName = planName;
    }

    public String getPlanName() { return planName; }
    public void setPlanName(String planName) { this.planName = planName; }

    public void showPlanDetails() {
        System.out.println("Conservation Plan: " + planName);
    }
}
