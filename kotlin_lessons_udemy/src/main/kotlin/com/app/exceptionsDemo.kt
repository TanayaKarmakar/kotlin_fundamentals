package com.app

fun main(args: Array<String>) {
    var input = readLine()

    try {
        println(input?.toInt())
    } catch (e: Exception) {
        println("Error occurred ${e.localizedMessage}")
    }

    println("Execution after exception")
}