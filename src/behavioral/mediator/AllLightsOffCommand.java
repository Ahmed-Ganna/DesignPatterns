package behavioral.mediator;


//concrete command
public class AllLightsOffCommand implements Command {
    private Mediator mediator;

    public AllLightsOffCommand(Mediator mediator) {
        this.mediator = mediator;
    }


    @Override
    public void execute() {
        mediator.turnAllLightsOff();
    }
}
