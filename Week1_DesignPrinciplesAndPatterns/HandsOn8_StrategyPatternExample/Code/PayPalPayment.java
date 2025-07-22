package Week1_DesignPrinciplesAndPatterns.HandsOn8_StrategyPatternExample.Code;

/*
 * Concrete strategy for PayPal payment
 */
public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal: " + email);
    }
}
