package com.app.practice

fun main(args: Array<String>) {
    val numbers = listOf(3, 67, 76, 45, 3435, 345, 487, 10, 476, 9, 2819, 3886)

    val subset = numbers.map {
        if(it % 2 == 0)
            it / 2
        else
            it * 2
    }.filter { it > 25 }

    println(subset)
}