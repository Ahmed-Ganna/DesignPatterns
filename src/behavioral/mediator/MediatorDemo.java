package behavioral.mediator;

import behavioral.command.Light;

public class MediatorDemo {



    public static void main(String[] args) {
        Light bedroomLight = new Light();
        Light kitchenLight = new Light();

        Mediator mediator = new Mediator();
        mediator.registerLight(bedroomLight);
        mediator.registerLight(kitchenLight);

        Command commandOff = new AllLightsOffCommand(mediator);
        Command commandOn = new AllLightsOnCommand(mediator);

        commandOn.execute();
        commandOff.execute();

    }
}
