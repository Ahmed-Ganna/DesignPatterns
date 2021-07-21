package behavioral.command;

import java.util.List;

//CommandConcrete
public class AllLightsOffCommand implements Command{

    private List<Light> lights;

    public AllLightsOffCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void command() {
        for (Light light : lights) {
            if (light.isOn()){
                light.toggle();
            }
        }
    }
}
