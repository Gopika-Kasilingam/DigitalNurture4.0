package org.example;

public class PerformanceTester {

    public void performTask() {
        // Simulate some work, e.g., sleeping for 200 milliseconds
        try {
            Thread.sleep(200);  // Task takes 200ms
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupt status
            throw new RuntimeException("Task was interrupted", e);
        }
    }
}
