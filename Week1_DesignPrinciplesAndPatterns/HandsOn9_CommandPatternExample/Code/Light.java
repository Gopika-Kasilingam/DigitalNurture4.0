package Week1_DesignPrinciplesAndPatterns.HandsOn9_CommandPatternExample.Code;

/*
 * Receiver class that has the actual business logic.
 * Executes the real operations like turning light on/off.
 */

public class Light {
    public void turnOn() {
        System.out.println("Light is ON");
    }

    public void turnOff() {
        System.out.println("Light is OFF");
    }
}
