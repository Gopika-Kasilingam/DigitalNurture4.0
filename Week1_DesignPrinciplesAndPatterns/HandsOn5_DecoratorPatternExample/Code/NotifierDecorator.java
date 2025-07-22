package Week1_DesignPrinciplesAndPatterns.HandsOn5_DecoratorPatternExample.Code;

// Abstract decorator
public abstract class NotifierDecorator implements Notifier {
    protected Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        notifier.send(message); // delegate base notification
    }
}
