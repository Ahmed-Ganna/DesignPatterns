package behavioral.state;

public class FanMedState extends State {
    private final Fan fan;

    public FanMedState(Fan fan) {
        this.fan = fan;
    }

    @Override
    void handleRequest() {
        System.out.println("Pulling chain to high");
        fan.setState(fan.getFanHighState());
    }

    @Override
    public String toString() {
        return "Fan is med";
    }
}
