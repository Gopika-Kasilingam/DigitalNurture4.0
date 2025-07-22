package Week1_DesignPrinciplesAndPatterns.HandsOn7_ObserverPatternExample.Code;

public interface Stock {
    void registerObserver(Observer observer);   // Add a client
    void removeObserver(Observer observer);     // Remove a client
    void notifyObservers();                     // Notify all registered clients
}
