package com.zgenit.inheritance

fun main(){
    val shippingCosts = ShippingServiceOCP("Depok", "Pati")
    println("This is shipping costs from ${shippingCosts.origin.toUpperCase()} to ${shippingCosts.destination.toUpperCase()}")
    shippingCosts.printCost(JneShip())
    shippingCosts.printCost(PosShip())
    shippingCosts.printCost(TikiShip())
    shippingCosts.printCost(JntShip())
}

class ShippingServiceOCP(val origin : String, val destination : String){
    fun printCost(shipping: Shipping){
        println("with ${shipping.name} -> ${shipping.getCost()}")
    }
}

abstract class Shipping{
    abstract val name : String
    abstract fun getCost() : Int
}

class JneShip : Shipping(){
    override val name: String = "JNE Ship"
    override fun getCost() : Int{
        return 20000
    }
}

class PosShip : Shipping(){
    override val name: String = "POS Ship"
    override fun getCost(): Int {
        return 24000
    }
}

class TikiShip : Shipping(){
    override val name: String = "TIKI Ship"
    override fun getCost(): Int {
        return 27000
    }
}

class JntShip : Shipping(){
    override val name: String = "JNT Ship"
    override fun getCost(): Int {
        return 25000
    }
}