package Week1_Algorithms_DataStructures.HandsOn5_TaskManagementSystem.Code;

public class TaskLinkedList {
    private TaskNode head;

    // Add a task at the end
    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);

        if (head == null) {
            head = newNode;
        } else {
            TaskNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Search for a task by ID
    public Task searchTask(int taskId) {
        TaskNode current = head;
        while (current != null) {
            if (current.task.getTaskId() == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    // Delete a task by ID
    public boolean deleteTask(int taskId) {
        if (head == null) return false;

        if (head.task.getTaskId() == taskId) {
            head = head.next;
            return true;
        }

        TaskNode current = head;
        while (current.next != null && current.next.task.getTaskId() != taskId) {
            current = current.next;
        }

        if (current.next == null) {
            return false;
        } else {
            current.next = current.next.next;
            return true;
        }
    }

    // Traverse and print all tasks
    public void traverseTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        TaskNode current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }
}

