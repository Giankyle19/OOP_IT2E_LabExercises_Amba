public class EcoPolicy {
    private String policyName;

    public EcoPolicy(String policyName) {
        super();
        this.policyName = policyName;
    }

    public String getPolicyName() { return policyName; }
    public void setPolicyName(String policyName) { this.policyName = policyName; }

    public void enforcePolicy() {
        System.out.println("Enforcing Eco Policy: " + policyName);
    }
}
