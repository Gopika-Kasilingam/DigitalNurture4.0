package Week1_DesignPrinciplesAndPatterns.HandsOn4_AdapterPatternExample.Code;

// Adapter: Adapts PayPalGateway to PaymentProcessor
public class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway payPal;

    public PayPalAdapter(PayPalGateway payPal) {
        this.payPal = payPal;
    }

    @Override
    public void processPayment(double amount) {
        payPal.makePayment(amount);
    }
}
