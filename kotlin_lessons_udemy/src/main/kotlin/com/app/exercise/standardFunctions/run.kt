package com.app.exercise.standardFunctions

fun main(args: Array<String>) {
    Laptop().run {
        turnOn()
        turnOff()
    }
}

class Laptop {
    fun turnOff() {
        println("Turning laptop OFF")
    }

    fun turnOn() {
        println("Turning laptop ON")
    }
}