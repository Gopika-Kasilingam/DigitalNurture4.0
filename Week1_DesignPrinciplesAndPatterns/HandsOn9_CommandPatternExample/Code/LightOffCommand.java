package Week1_DesignPrinciplesAndPatterns.HandsOn9_CommandPatternExample.Code;

//Concrete command to turn the light off.
 
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
