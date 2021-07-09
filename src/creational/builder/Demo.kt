package creational.builder

fun main(args: Array<String>) {

    val order = LaunchOrder.Builder().bread("Bread").meat("Meat").dressing("Dressing").build()
    println("${order.bread} , ${order.dressing} , ${order.dressing}")



}