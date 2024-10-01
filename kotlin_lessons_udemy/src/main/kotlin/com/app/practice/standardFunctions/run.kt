package com.app.practice.standardFunctions

fun main(args: Array<String>) {
    val rest: Restaurant = Restaurant().run {
        standardDish = "Fish and Chips"
        todaysSpecial = "Fillet mignon"
        printMenu()
        this
    }

    println(rest)
}

class Restaurant {
    var standardDish = ""
    var todaysSpecial = ""

    fun printMenu() {
        println("The standard dish is $standardDish")
        println("Today's special is $todaysSpecial")
    }
}