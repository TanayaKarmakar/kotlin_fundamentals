package com.app.exercise

fun main(args: Array<String>) {
    val hasEggs = false
    val hasBacon = true

    val eggPrice = 5
    val baconPrice = 20

    var totalPrice = 0

    if(hasEggs) {
        totalPrice += (5 * eggPrice)
        if(hasBacon) {
            totalPrice += (2 * baconPrice)
        }
    } else {
        println("No eggs available")
    }

    println("Amount spent in the market $totalPrice")
}