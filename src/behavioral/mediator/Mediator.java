package behavioral.mediator;

import behavioral.command.Light;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    private List<Light> lights = new ArrayList<>();


    public void registerLight(Light light){
        lights.add(light);
    }

    public void turnAllLightsOn(){
        for (Light light : lights) {

            if (!light.isOn()) {

                light.toggle();

            }
        }
    }

    public void turnAllLightsOff(){
        for (Light light : lights) {

            if (light.isOn()) {

                light.toggle();

            }
        }
    }

}
