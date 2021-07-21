package behavioral.command;

//CommandConcrete
public class ToggleCommand implements Command{

    private Light light;

    public ToggleCommand(Light light) {
        this.light = light;
    }

    @Override
    public void command() {
        light.toggle();
    }
}
