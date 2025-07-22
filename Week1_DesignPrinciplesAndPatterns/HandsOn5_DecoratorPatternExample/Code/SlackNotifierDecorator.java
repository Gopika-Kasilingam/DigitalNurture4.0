package Week1_DesignPrinciplesAndPatterns.HandsOn5_DecoratorPatternExample.Code;

// Concrete decorator for Slack
public class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message); // Send base notification
        sendSlack(message);  // Add Slack functionality
    }

    private void sendSlack(String message) {
        System.out.println("Sending Slack message: " + message);
    }
}
