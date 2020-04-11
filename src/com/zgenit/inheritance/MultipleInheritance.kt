package com.zgenit.inheritance

fun main() {
    val whale = MtWhale("Whale")
    whale.walk()
    whale.eat()
}

interface MtAnimal{
    fun walk()
}

interface MtMammal{
    fun eat()
}

class MtWhale(var name : String = "whale") : MtAnimal, MtMammal{
    override fun walk() {
        println("$name is now walking ...")
    }

    override fun eat() {
        println("$name is now eating ...")
    }

}