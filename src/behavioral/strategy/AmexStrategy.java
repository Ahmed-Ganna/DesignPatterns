package behavioral.strategy;

public class AmexStrategy extends ValidationStrategy{


    @Override
    boolean isValid(CreditCard creditCard) {
        boolean isValid;

        isValid = creditCard.getNumber().startsWith("34") || creditCard.getNumber().startsWith("37");

        if (isValid){
            isValid = creditCard.getNumber().length() == 15;
        }

        if (isValid){
            isValid = passesLuhn(creditCard.getNumber());
        }
        return isValid;
    }
}
