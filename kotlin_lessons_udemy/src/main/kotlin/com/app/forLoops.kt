package com.app

fun main(args: Array<String>) {
    val animals = arrayListOf("dog", "cat", "mouse", "bear")

    for(animal in animals) {
        println("Feed the $animal")
    }

    val customers = hashMapOf(Pair("Alice", 4), Pair("Judy", 8), Pair("Anna", 6))

    for(customer in customers.keys) {
        val purchases = customers[customer]

        println("$customer you purchased $purchases items")
    }

    for(i in 10 downTo 1) {
        println("Current value $i")
    }
}