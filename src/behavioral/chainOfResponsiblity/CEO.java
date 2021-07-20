package behavioral.chainOfResponsiblity;

public class CEO extends Handler{


    @Override
    void handleRequest(Request request) {
        System.out.println("Handling anything by CEO");
    }
}
