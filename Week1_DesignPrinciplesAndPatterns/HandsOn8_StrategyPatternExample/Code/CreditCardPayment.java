package Week1_DesignPrinciplesAndPatterns.HandsOn8_StrategyPatternExample.Code;

/*
 * Concrete strategy for Credit Card payment
 */
public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card: " + cardNumber);
    }
}
