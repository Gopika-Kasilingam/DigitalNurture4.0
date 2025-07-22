package Week1_DesignPrinciplesAndPatterns.HandsOn5_DecoratorPatternExample.Code;

public class Main {
    public static void main(String[] args) {
        // Base notifier: email only
        Notifier notifier = new EmailNotifier();

        // Add SMS notification
        notifier = new SMSNotifierDecorator(notifier);

        // Add Slack notification
        notifier = new SlackNotifierDecorator(notifier);

        // Send notification via all channels
        notifier.send("Your order has been shipped!");
    }
}
