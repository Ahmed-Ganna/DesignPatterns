package behavioral.mediator;

import java.util.*;

public class MediatorEverydayDemo {


    public MediatorEverydayDemo(int sec) {
        Timer timer = new Timer();
        timer.schedule(new WakeUpTask(),sec * 1000L);
        timer.schedule(new WakeUpTaskWithBeep(),sec * 2 * 1000L);

    }

    static class WakeUpTask extends TimerTask {

        @Override
        public void run() {
            System.out.println("Wake up , it is too close");
        }
    }

    static class WakeUpTaskWithBeep extends TimerTask {

        @Override
        public void run() {
            System.out.println("Now wake up , it is really too close");
            //toolkit.beep;
        }
    }


    public static void main(String[] args) {
        new MediatorEverydayDemo(3);
    }
}
