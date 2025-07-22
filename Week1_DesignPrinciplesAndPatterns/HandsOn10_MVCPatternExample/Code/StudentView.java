package Week1_DesignPrinciplesAndPatterns.HandsOn10_MVCPatternExample.Code;

// View class that displays student details.

public class StudentView {
    public void displayStudentDetails(String name, String id, String grade) {
        System.out.println("----- Student Details -----");
        System.out.println("Name  : " + name);
        System.out.println("ID    : " + id);
        System.out.println("Grade : " + grade);
    }
}
