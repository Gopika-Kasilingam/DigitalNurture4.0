package Week1_DesignPrinciplesAndPatterns.HandsOn7_ObserverPatternExample.Code;

// Observer interface that clients must implement
public interface Observer {
    void update(double price);  // Called when stock price changes
}
