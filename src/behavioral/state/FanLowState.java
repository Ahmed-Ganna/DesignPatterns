package behavioral.state;

public class FanLowState extends State {
    private final Fan fan;

    public FanLowState(Fan fan) {
        this.fan = fan;
    }

    @Override
    void handleRequest() {
        System.out.println("Pulling chain to med");
        fan.setState(fan.getFanMedState());
    }

    @Override
    public String toString() {
        return "Fan is low";
    }
}
