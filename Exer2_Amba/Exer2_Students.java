public class Students {
    private String studentId;
    private String name;
    private String age;   
    private String gender;
    private String course;
    private String yearLevel;

  
    public Students() {
        this.studentId = "No ID yet";
        this.name = "No Name";
        this.age = "No Age";
        this.gender = "Not Specified";
        this.course = "Undecided";
        this.yearLevel = "Freshman";
    }


    public Students(String studentId, String name, String age, String gender, String course, String yearLevel) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.course = course;
        this.yearLevel = yearLevel;
    }


    public void studentsInfo() {
        String info = "";
        info += "\nStudent ID: " + this.studentId;
        info += "\nName: " + this.name;
        info += "\nAge: " + this.age;
        info += "\nGender: " + this.gender;
        info += "\nCourse: " + this.course;
        info += "\nYear Level: " + this.yearLevel;
        System.out.println(info);
    }
}
