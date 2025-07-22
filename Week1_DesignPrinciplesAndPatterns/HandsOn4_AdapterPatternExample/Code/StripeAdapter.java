package Week1_DesignPrinciplesAndPatterns.HandsOn4_AdapterPatternExample.Code;

// Adapter: Adapts StripeGateway to PaymentProcessor
public class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripe;

    public StripeAdapter(StripeGateway stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processPayment(double amount) {
        stripe.sendPayment(amount);
    }
}
