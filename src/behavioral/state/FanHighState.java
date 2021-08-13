package behavioral.state;

public class FanHighState extends State {
    private Fan fan;

    public FanHighState(Fan fan) {
        this.fan = fan;
    }

    @Override
    void handleRequest() {
        System.out.println("Pulling chain to off");
        fan.setState(fan.getFanOffState());
    }

    @Override
    public String toString() {
        return "Fan is high";
    }
}
