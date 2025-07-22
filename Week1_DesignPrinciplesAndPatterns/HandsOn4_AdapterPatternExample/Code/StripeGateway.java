package Week1_DesignPrinciplesAndPatterns.HandsOn4_AdapterPatternExample.Code;

// Adaptee 2: Another gateway with a different method
public class StripeGateway {
    public void sendPayment(double amount) {
        System.out.println("Payment of $" + amount + " processed via Stripe.");
    }
}
