package behavioral.command;

import java.util.ArrayList;
import java.util.List;

//Client
public class CommandDemo {



    public static void main(String[] args) {
       Light bedroomLight = new Light(); // Receiver
       Light kitchenLight = new Light(); // Receiver
       Switch aSwitch = new Switch(); // Invoker - has custom implementation  - may be storing after executing

       Command command = new ToggleCommand(bedroomLight); // Command

       aSwitch.storeAndExecute(command);

        List<Light> lights = new ArrayList<>();

        lights.add(bedroomLight);
        lights.add(kitchenLight);

        Command allOffCommand = new AllLightsOffCommand(lights);

        aSwitch.storeAndExecute(allOffCommand);
    }
}
