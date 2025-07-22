package Week1_Algorithms_DataStructures.HandsOn5_TaskManagementSystem.Code;

public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        // Add tasks
        taskList.addTask(new Task(1, "Design database schema", "Pending"));
        taskList.addTask(new Task(2, "Implement API", "In Progress"));
        taskList.addTask(new Task(3, "Test endpoints", "Pending"));

        System.out.println("All Tasks:");
        taskList.traverseTasks();

        // Search task
        int searchId = 2;
        Task foundTask = taskList.searchTask(searchId);
        if (foundTask != null) {
            System.out.println("\nTask found: " + foundTask);
        } else {
            System.out.println("\nTask with ID " + searchId + " not found.");
        }

        // Delete task
        int deleteId = 1;
        boolean deleted = taskList.deleteTask(deleteId);
        System.out.println("\nTask with ID " + deleteId + (deleted ? " deleted." : " not found."));

        System.out.println("\nUpdated Task List:");
        taskList.traverseTasks();
    }
}

