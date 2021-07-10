package creational.abstractFactory;

public abstract class CreditCard {

    private int cardNumberLength;
    private int cvv;

    public int getCardNumberLength() {
        return cardNumberLength;
    }

    public void setCardNumberLength(int cardNumberLength) {
        this.cardNumberLength = cardNumberLength;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
}
