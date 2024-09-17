package com.app

fun main(args: Array<String>) {
    println("Sum of numbers")
    val result = sumNumbers(1,2,3,5,6,7)

    println("Result is $result")
}

fun sumNumbers(vararg numbers: Int): Int {
    var sum = 0
    for(number in numbers) {
        sum += number
    }
    return sum
}