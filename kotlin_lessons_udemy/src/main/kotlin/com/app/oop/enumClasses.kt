package com.app.oop

fun main(args: Array<String>) {
    val color = Colors.RED
    when(color) {
        Colors.RED -> println("You chose red")
        Colors.GREEN -> println("You chose green")
        Colors.BLUE -> println("You chose blue")
    }

    println(Colors.RED.timesUsed)
    println(Colors.GREEN.name)
    println(Colors.BLUE.ordinal)
}

enum class Colors(val timesUsed: Int) {
    RED(34),
    GREEN(12),
    BLUE(45)
}