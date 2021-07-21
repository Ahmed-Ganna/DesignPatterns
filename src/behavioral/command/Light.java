package behavioral.command;

//Receiver
public class Light {

    private boolean isOn ;

    public void toggle(){
        if (isOn){
            off();
        }else {
            on();
        }
        isOn = !isOn;
    }

    private void on(){
        System.out.println("On");
    }

    private void off(){
        System.out.println("Off");
    }

    public boolean isOn() {
        return isOn;
    }
}
