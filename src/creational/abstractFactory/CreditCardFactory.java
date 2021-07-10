package creational.abstractFactory;

public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int score){

        if(score > 650) {
            return new AmexFactory();
        }
        else {
            return new VisaFactory();
        }
    }


    abstract Validator getValidator(CardType cardType);


    abstract CreditCard getCreditCard(CardType type);
}
