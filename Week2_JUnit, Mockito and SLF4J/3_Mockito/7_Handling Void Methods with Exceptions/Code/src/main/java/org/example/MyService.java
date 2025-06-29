package org.example;

public class MyService {
    private final Logger logger;

    public MyService(Logger logger) {
        this.logger = logger;
    }

    public void process() {
        try {
            logger.log("Processing started");
        } catch (RuntimeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
