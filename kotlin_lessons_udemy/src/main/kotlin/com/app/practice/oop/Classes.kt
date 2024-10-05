package com.app.practice.oop

fun main(args: Array<String>) {
    val cat = Animal()
    cat.run()

    cat.name = "Fluffy"
    cat.topSpeed = 40

    cat.run()
}

class Animal {
    var topSpeed = 0
    var name = "Animal"

    fun run() {
        println("$name's top speed is $topSpeed")
    }
}