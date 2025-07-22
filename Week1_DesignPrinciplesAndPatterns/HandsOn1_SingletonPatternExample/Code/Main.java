package Week1_DesignPrinciplesAndPatterns.HandsOn1_SingletonPatternExample.Code;

/*
 * Singleton Pattern: Ensures only one instance of a class is created
 * and provides a global access point.
 * 
 * Usecases - Logging, Database connection, Caching
 */

class Logger {
    // Single static instance
    private static Logger logger;

    // Private constructor to prevent external instantiation
    private Logger() {
        System.out.println("Logger instance is created");
    }

    // Returns the single instance (lazy initialization)
    public static Logger getLogger() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
}

/*
 * Main class to test Singleton behavior.
 */
public class Main {
    public static void main(String[] args) {
        // First call: creates the instance
        Logger log1 = Logger.getLogger();
        System.out.println("Logger instance from log1: " + log1);

        // Second call: returns the same instance
        Logger log2 = Logger.getLogger();
        System.out.println("Logger instance from log2: " + log2);

        // Check if both references point to the same object
        if (log1 == log2) {
            System.out.println("Same instances (Singleton confirmed)");
        } else {
            System.out.println("Different instances (Singleton failed)");
        }
    }
}
