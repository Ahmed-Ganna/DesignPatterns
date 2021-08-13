package behavioral.state;

public class FanOffState extends State {
    private final Fan fan;

    public FanOffState(Fan fan) {
        this.fan = fan;
    }

    @Override
    void handleRequest() {
        System.out.println("Pulling chain to low");
        fan.setState(fan.getFanLowState());
    }

    @Override
    public String toString() {
        return "Fan is off";
    }
}
