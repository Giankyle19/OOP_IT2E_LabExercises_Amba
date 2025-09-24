public class Report {
    private String reportName;

    public Report(String reportName) {
        super();
        this.reportName = reportName;
    }

    public String getReportName() { return reportName; }
    public void setReportName(String reportName) { this.reportName = reportName; }

    public void generateReport() {
        System.out.println("Generating Report: " + reportName);
    }
}
