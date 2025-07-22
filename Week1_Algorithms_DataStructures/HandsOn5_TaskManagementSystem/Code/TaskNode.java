package Week1_Algorithms_DataStructures.HandsOn5_TaskManagementSystem.Code;

public class TaskNode {
    Task task;
    TaskNode next;

    public TaskNode(Task task) {
        this.task = task;
        this.next = null;
    }
}

