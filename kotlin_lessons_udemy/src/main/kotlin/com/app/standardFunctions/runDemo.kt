package com.app.standardFunctions

fun main(args: Array<String>) {
    val newCar = Car6().run {
        speed = 76
        drive()
        println("Car6 is driving")
    }

    println(newCar)


    run {
        var car2 = Car6()
        car2.speed = 80
        car2.drive()

        println("Car2 is driving")
    }
}

class Car6 {
    var speed = 10

    fun drive() {
        println("Car is driving at $speed")
    }
}