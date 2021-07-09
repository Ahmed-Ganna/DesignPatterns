package creational.prototype

fun main(args: Array<String>) {

    val registry = Registry()

    println(registry.getItem("book"))
    println(registry.getItem("movie"))
}