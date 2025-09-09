public class StudentsInfo {
    public static void main(String[] args) {
      
        Students student1 = new Students("2025-001", "Juan Dela Cruz", "18", "Male", "BSIT", "Freshman");
        Students student2 = new Students();
      
        student1.studentsInfo();
        student2.studentsInfo();
    }
}
