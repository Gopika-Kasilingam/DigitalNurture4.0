package Week1_DesignPrinciplesAndPatterns.HandsOn10_MVCPatternExample.Code;

// Controller class that connects model and view.
 
public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    // Update model data
    public void setStudentName(String name) {
        model.setName(name);
    }

    public void setStudentGrade(String grade) {
        model.setGrade(grade);
    }

    // Access model data
    public String getStudentName() {
        return model.getName();
    }

    public String getStudentId() {
        return model.getId();
    }

    public String getStudentGrade() {
        return model.getGrade();
    }

    // Update view
    public void updateView() {
        view.displayStudentDetails(model.getName(), model.getId(), model.getGrade());
    }
}
