public class SustainabilityGoal {
    private String goalDescription;

    public SustainabilityGoal(String goalDescription) {
        super();
        this.goalDescription = goalDescription;
    }

    public String getGoalDescription() { return goalDescription; }
    public void setGoalDescription(String goalDescription) { this.goalDescription = goalDescription; }

    public void trackProgress() {
        System.out.println("Tracking progress for goal: " + goalDescription);
    }
}
