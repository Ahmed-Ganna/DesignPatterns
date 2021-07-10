package creational.abstractFactory;

public class AmexFactory extends CreditCardFactory{


    @Override
    Validator getValidator(CardType cardType) {
        switch (cardType){
            case GOLD:
                return new AmexGoldValidator();
            case PLATINUM:
                return new AmexPlatinumValidator();
            default:
                return null;
        }
    }

    @Override
    CreditCard getCreditCard(CardType type) {
        switch (type){
            case GOLD:
                return new AmexGoldCreditCard();
            case PLATINUM:
                return new AmexPlatinumCreditCard();
            default:
                return null;
        }    }
}
