package behavioral.chainOfResponsiblity;

public class Request {
    private RequestType type;
    private int amount;


    public Request(RequestType type) {
        this.type = type;
    }

    public Request(RequestType type, int amount) {
        this.type = type;
        this.amount = amount;
    }

    public RequestType getType() {
        return type;
    }

    public void setType(RequestType type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
