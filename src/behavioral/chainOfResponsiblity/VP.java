package behavioral.chainOfResponsiblity;

public class VP extends Handler{


    @Override
    void handleRequest(Request request) {
        if (request.getType() == RequestType.PURCHASE){
            if (request.getAmount() <= 1500){
                System.out.println("Handling PURCHASE by VP");
            }
        }
    }
}
