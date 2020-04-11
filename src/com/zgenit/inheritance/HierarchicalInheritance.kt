package com.zgenit.inheritance

fun main() {
    val cat = HCat("Keti")
    cat.walk()
    val whale = HWhale("Weli")
    whale.walk()
}

open class HAnimal{
    open fun walk(){
        println("Animal is walking ...")
    }
}

class HCat(var name : String = ""): HAnimal(){
    override fun walk() {
        super.walk()
        println("$name is now walking ...")
    }
}

class HWhale(var name : String = "") : HAnimal(){
    override fun walk() {
        super.walk()
        println("$name is now walking ....")
    }
}