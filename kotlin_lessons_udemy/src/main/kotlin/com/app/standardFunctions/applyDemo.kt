package com.app.standardFunctions

fun main(args: Array<String>) {
    val myCar: MyCar = MyCar().apply {
        speed = 50
        color = "Red"
        startCar()
    }

    println(myCar)
}

class MyCar {
    var speed = 10
    var color = "Blue"

    fun startCar() {
        println("Starting the car, speed is $speed, color is $color")
    }



}