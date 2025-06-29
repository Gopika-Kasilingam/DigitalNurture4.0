package org.example;

public class MyService {
    private final Logger logger;

    public MyService(Logger logger) {
        this.logger = logger;
    }

    public void doWork() {
        // do something useful...
        logger.log("Work completed");
    }
}
