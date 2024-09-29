package com.app.standardFunctions

fun main(args: Array<String>) {
    val animals = listOf("cat", "dog", "bear", "zebra", "mouse")

    animals.map { it.length }
            .filter { it > 3 }
            .let {
                println(it)
                println("Size of list is ${it.size}")
            }

    val name = readLine()
    name?.let { println("Your name is $it") }
}