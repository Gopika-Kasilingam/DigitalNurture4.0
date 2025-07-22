package Week1_DesignPrinciplesAndPatterns.HandsOn9_CommandPatternExample.Code;

/*
 * Concrete command to turn the light on.
 * Delegates the request to the receiver (Light).
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
