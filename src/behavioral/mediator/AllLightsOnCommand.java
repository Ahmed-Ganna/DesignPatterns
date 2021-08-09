package behavioral.mediator;


//concrete command
public class AllLightsOnCommand implements Command {
    private Mediator mediator;

    public AllLightsOnCommand(Mediator mediator) {
        this.mediator = mediator;
    }


    @Override
    public void execute() {
        mediator.turnAllLightsOn();
    }
}
