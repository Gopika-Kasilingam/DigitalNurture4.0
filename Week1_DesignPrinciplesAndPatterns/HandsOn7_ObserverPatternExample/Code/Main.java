package Week1_DesignPrinciplesAndPatterns.HandsOn7_ObserverPatternExample.Code;

/*
 * Demonstrates the Observer Pattern:
 * Observers are notified automatically when the subject (stock market) changes.
 */
public class Main {
    public static void main(String[] args) {
        // Create stock market (subject)
        StockMarket stockMarket = new StockMarket();

        // Create observers
        Observer mobileApp = new MobileApp("MobileApp");
        Observer webApp = new WebApp("WebApp");

        // Register observers
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        // Simulate stock price changes
        stockMarket.setStockPrice(100.50);
        stockMarket.setStockPrice(105.75);

        // Remove one observer and update again
        System.out.println("\nRemoving WebApp from observers...");
        stockMarket.removeObserver(webApp);
        stockMarket.setStockPrice(110.00);
    }
}
