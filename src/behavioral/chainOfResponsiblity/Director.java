package behavioral.chainOfResponsiblity;

public class Director extends Handler{


    @Override
    void handleRequest(Request request) {
        if (request.getType() == RequestType.CONFERENCE){
            System.out.println("Handling conference by Director");
        }else {
            successor.handleRequest(request);
        }
    }
}
