package com.app.oop

fun main(args: Array<String>) {
    println(Car4.drivingInstructions())
}

class Car4 {
    companion object {
        fun drivingInstructions(): String {
            return "Drive safe"
        }
    }
}