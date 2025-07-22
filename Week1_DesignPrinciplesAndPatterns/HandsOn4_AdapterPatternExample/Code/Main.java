package Week1_DesignPrinciplesAndPatterns.HandsOn4_AdapterPatternExample.Code;

/*
 * Demonstrates the Adapter Pattern by allowing different payment gateways
 * to be used via a common interface: PaymentProcessor.
 * 
 * The Adapter Pattern allows incompatible interfaces to work together 
 * by acting as a bridge between an existing class (Adaptee) 
 * and the expected interface (Target).
 * 
 */

public class Main {
    public static void main(String[] args) {
        // Using PayPal via adapter
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPalGateway());
        paypalProcessor.processPayment(150.0);

        // Using Stripe via adapter
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripeGateway());
        stripeProcessor.processPayment(300.0);
    }
}
