package Week1_DesignPrinciplesAndPatterns.HandsOn8_StrategyPatternExample.Code;

/*
 * Demonstrates the Strategy Pattern:
 * Allows switching between payment methods at runtime.
 */

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        context.pay(250.0);

        // Switch to PayPal payment
        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.pay(150.0);
    }
}
