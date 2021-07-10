package creational.abstractFactory

fun main(args: Array<String>) {


    var factory = CreditCardFactory.getCreditCardFactory(700)

    println(factory.getCreditCard(CardType.GOLD))


    factory = CreditCardFactory.getCreditCardFactory(500)

    println(factory.getCreditCard(CardType.GOLD))


}