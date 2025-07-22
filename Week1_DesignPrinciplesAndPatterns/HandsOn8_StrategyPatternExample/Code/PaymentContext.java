package Week1_DesignPrinciplesAndPatterns.HandsOn8_StrategyPatternExample.Code;

/*
 * Context class that uses a PaymentStrategy
 * Allows changing the strategy at runtime
 */

public class PaymentContext {
    private PaymentStrategy strategy;

    // Set or change strategy dynamically
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    // Execute the selected payment strategy
    public void pay(double amount) {
        if (strategy == null) {
            System.out.println("No payment strategy selected.");
        } else {
            strategy.pay(amount);
        }
    }
}
