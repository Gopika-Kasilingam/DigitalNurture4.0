package Week1_DesignPrinciplesAndPatterns.HandsOn5_DecoratorPatternExample.Code;

// Concrete component
public class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}
