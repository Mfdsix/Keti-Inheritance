package com.zgenit.inheritance

fun main() {
    val cat = Cat("Anggora")
    cat.walk()
}

open class Animal{
    open fun walk(){
        println("This animal is walking")
    }
}

class Cat(var name: String = "cat") : Animal(){
    override fun walk() {
        super.walk()
        println("$name is walking ...")
    }
}