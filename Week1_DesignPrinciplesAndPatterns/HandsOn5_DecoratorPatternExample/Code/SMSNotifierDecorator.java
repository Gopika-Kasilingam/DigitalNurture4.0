package Week1_DesignPrinciplesAndPatterns.HandsOn5_DecoratorPatternExample.Code;

// Concrete decorator for SMS
public class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message); // Send base notification
        sendSMS(message);    // Add SMS functionality
    }

    private void sendSMS(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
