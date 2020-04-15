package com.zgenit.inheritance

fun main() {
    val shipping = ShippingService("Depok", "Semarang")
    val tikiCost = shipping.getCost(ShippingCost.TIKI)
    val posCost = shipping.getCost(ShippingCost.POS)
    val jneCost = shipping.getCost(ShippingCost.JNE)
    val jntCost = shipping.getCost(ShippingCost.JNT)

    println("This is lists of shipping cost from ${shipping.origin.toUpperCase()} to ${shipping.destination.toUpperCase()}")
    println(" - With TIKI $tikiCost")
    println(" - With POS $posCost")
    println(" - With JNE $jneCost")
    println(" - With JNT $jntCost")
}

class ShippingService(var origin : String, var destination : String){
    fun getCost(shipping : ShippingCost): Int{
        when(shipping){
            ShippingCost.TIKI -> return ShippingCost.TIKI.cost
            ShippingCost.POS -> return ShippingCost.POS.cost
            ShippingCost.JNE -> return ShippingCost.JNE.cost
            ShippingCost.JNT -> return ShippingCost.JNT.cost
            else -> return -1
        }
    }
}

enum class ShippingCost(val cost: Int){
    TIKI(25000),
    POS(24000),
    JNE(20000),
    JNT(22000)
}