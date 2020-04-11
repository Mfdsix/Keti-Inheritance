package com.zgenit.inheritance

fun main() {
    val whale = MlWhale("Whale")
    println(whale.walk())
}

open class MlAnimal{
    open fun walk(){
        println("This animal is walking ...")
    }
}

open class MlMammal : MlAnimal(){
    override fun walk(){
        super.walk()
        println("Mammal is walking ...")
    }
}

class MlWhale(var name : String): MlMammal(){
    override fun walk() {
        super.walk()
        println("$name is now walking ...")
    }
}