package com.app.standardFunctions

fun main(args: Array<String>) {
    with(Car5()) {
        speed = 80
        drive()
        println("Car is driving")
    }
}

class Car5 {
    var speed = 50

    fun drive() {
        println("Driving at $speed")
    }
}