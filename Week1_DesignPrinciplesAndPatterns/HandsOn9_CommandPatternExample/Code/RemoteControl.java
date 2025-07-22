package Week1_DesignPrinciplesAndPatterns.HandsOn9_CommandPatternExample.Code;

/*
 * Invoker class that triggers commands.
 * Holds a reference to a command and executes it when needed.
 */
public class RemoteControl {
    private Command command;

    // Set the command to be executed
    public void setCommand(Command command) {
        this.command = command;
    }

    // Execute the command
    public void pressButton() {
        if (command != null) {
            command.execute();
        } else {
            System.out.println("No command set.");
        }
    }
}
