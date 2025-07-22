package Week1_DesignPrinciplesAndPatterns.HandsOn9_CommandPatternExample.Code;

/*
 * Demonstrates the Command Pattern.
 * RemoteControl triggers actions without knowing how they’re executed.
 */
public class Main {
    public static void main(String[] args) {
        // Receiver
        Light livingRoomLight = new Light();

        // Concrete commands
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Invoker
        RemoteControl remote = new RemoteControl();

        // Turn light ON
        remote.setCommand(lightOn);
        remote.pressButton();

        // Turn light OFF
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
