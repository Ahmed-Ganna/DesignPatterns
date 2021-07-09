package creational.singleton

fun main(args: Array<String>) {


    val instance = DBSingleton.getInstance()
    println(instance.connection)




}