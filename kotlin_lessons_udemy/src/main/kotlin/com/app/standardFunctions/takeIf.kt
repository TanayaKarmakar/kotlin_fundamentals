package com.app.standardFunctions

import kotlin.random.Random

fun main(args: Array<String>) {
    for(i in 1..20) {
        val number = Random.nextInt(100)

        val evenOrNull = number.takeIf { it % 2 == 0 }

        println("TakeIf: The number is $number")
        println("TakeIf: The even number is $evenOrNull")
    }

    for(i in 1..20) {
        val number = Random.nextInt(100)
        val oddOrNull = number.takeUnless { it % 2 == 0 }

        println("TakeUnless: The number is $number")
        println("TakeUnless: The odd number is $oddOrNull")
    }
}