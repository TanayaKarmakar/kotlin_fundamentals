package com.app.oop

fun main(args: Array<String>) {
    val myCar = Car3()
}

class Car3 {
    var model = "BMW"
    var topSpeed = 100

    init {
        println("This car is a $model and has a topspeed of $topSpeed")
    }
}