package Week1_DesignPrinciplesAndPatterns.HandsOn1_SingletonPatternExample.Code;

/*
 * Singleton Pattern ensures that only ONE instance of a class is created
 * throughout the application lifecycle. It provides a global point of access
 * to that instance.
 * 
 * 
 * ----------------------------- Logger Class -----------------------------
 * This class demonstrates the Singleton Design Pattern.
 * 
 */

class Logger {
    // Step 1: Create a private static instance of the same class
    private static Logger logger;

    // Step 2: Private constructor so that no other class can instantiate it
    private Logger() {
        System.out.println("Logger instance is created");
    }

    // Step 3: Public static method to provide global access point to the instance
    public static Logger getLogger() {
        // Lazy initialization: instance is created only when needed
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
}

/**
 * ----------------------------- Main Class -----------------------------
 * This class tests the Singleton behavior of the Logger class.
 */

public class Main {
    public static void main(String[] args) {
        // First call: Logger instance will be created
        Logger log1 = Logger.getLogger();
        System.out.println("Logger instance from log1: " + log1);

        // Second call: Same Logger instance will be returned
        Logger log2 = Logger.getLogger();
        System.out.println("Logger instance from log2: " + log2);

        // Verifying that both log1 and log2 refer to the same instance
        if (log1 == log2) {
            System.out.println("Same instances (Singleton confirmed)");
        } else {
            System.out.println("Different instances (Singleton failed)");
        }
    }
}
