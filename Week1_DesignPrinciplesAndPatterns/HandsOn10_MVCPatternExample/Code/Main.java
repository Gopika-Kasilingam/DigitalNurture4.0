package Week1_DesignPrinciplesAndPatterns.HandsOn10_MVCPatternExample.Code;

/*
 * Demonstrates MVC Pattern:
 * Model (Student) is updated via Controller,
 * and displayed via View.
 */

public class Main {
    public static void main(String[] args) {
        // Create model and view
        Student student = new Student("Alice", "S123", "A");
        StudentView view = new StudentView();

        // Create controller
        StudentController controller = new StudentController(student, view);

        // Display initial student data
        controller.updateView();

        // Update student data via controller
        controller.setStudentName("Bob");
        controller.setStudentGrade("A+");

        // Display updated student data
        controller.updateView();
    }
}
