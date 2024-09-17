package com.app

fun main(args: Array<String>) {
    val cats = listOf("Tiger", "Smokey", "Milk Powder", "Fluffy", "Oreo")

    var index = 0
    while(index < cats.size) {
        println("Cat: ${cats[index]}")
        index++
    }
}