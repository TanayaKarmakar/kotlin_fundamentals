package com.app

import kotlin.random.Random


fun main(args: Array<String>) {
    val nextRandomInt = Random.nextInt()

    println("Random number $nextRandomInt")

    val nextRandomIntUpto = Random.nextInt(10)

    println("Random number upto 10 is $nextRandomIntUpto")

    val randomNumberWithinRange = Random.nextInt(20, 30)

    println("Random number between 20 and 30 is $randomNumberWithinRange")
}