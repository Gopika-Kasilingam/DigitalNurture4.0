package Week1_DesignPrinciplesAndPatterns.HandsOn4_AdapterPatternExample.Code;

// Adaptee 1: Has a different method name
public class PayPalGateway {
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " processed via PayPal.");
    }
}
