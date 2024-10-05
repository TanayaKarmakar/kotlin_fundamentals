package com.app.oop

fun main(args: Array<String>) {
    val car = Car6()
    car.Engine().run()
}

class Car6 {
    var speed = 100

    fun drive() {
        println("Driving at $speed")
    }

    inner class Engine {
        val rpm = 300

        fun run() {
            this@Car6.speed = 150
            this@Car6.drive()
            println("Engine is running at $rpm")
        }
    }
}