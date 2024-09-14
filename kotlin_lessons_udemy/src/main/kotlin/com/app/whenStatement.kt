package com.app

fun main(args: Array<String>) {
    var action: String = ""

    var animal = "cat"

    when(animal) {
        "cat" -> action = "pet it"
        "dog" -> action = "feed it"
        else -> action = "google it"
    }

    println("when you meet a $animal you should $action")

    var result = ""
    var number = 2345
    when(number % 2) {
        0 -> result = "number is even"
        1 -> result = "number is odd"
    }
    println(result)

    val month = "January"
    val numDays = when(month) {
        "January", "March", "May" -> 31
        "February" -> 28
        else -> 30
    }

    println("The month of $month has $numDays days")
}