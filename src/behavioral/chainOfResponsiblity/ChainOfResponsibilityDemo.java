package behavioral.chainOfResponsiblity;


public class ChainOfResponsibilityDemo {

    public static void main(String[] args) {
        Handler bryan = new Director();
        Handler may = new VP();
        Handler jeff = new CEO();

        bryan.setSuccessor(may);
        may.setSuccessor(jeff);

        Request conference = new Request(RequestType.CONFERENCE);

        bryan.handleRequest(conference);

        Request purchaseMin = new Request(RequestType.PURCHASE,1400);

        may.handleRequest(purchaseMin);

        Request purchaseMax = new Request(RequestType.PURCHASE,3000);

        jeff.handleRequest(purchaseMax);
    }
}
