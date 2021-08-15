package behavioral.strategy;


public class StrategyDemo {



	public static void main(String args[]) {

		CreditCard amexCard1 = new CreditCard(new AmexStrategy());

		amexCard1.setNumber("379185883464283");
		amexCard1.setDate("04/2020");
		amexCard1.setCvv("123");

		System.out.println("Amex card 1 is valid : " +amexCard1.isValid());

		CreditCard amexCard2 = new CreditCard(new AmexStrategy());

		amexCard2.setNumber("329185883464283");
		amexCard2.setDate("04/2022");
		amexCard2.setCvv("123");

		System.out.println("Amex card 2 is valid : " +amexCard2.isValid());

		CreditCard visaCard = new CreditCard(new VisaStrategy());

		visaCard.setNumber("4539589763663402");
		visaCard.setDate("05/2018");
		visaCard.setCvv("324");

		System.out.println("Is Visa valid: " + visaCard.isValid());

	}
}
