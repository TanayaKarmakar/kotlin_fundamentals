package com.app.practice

fun main(args: Array<String>) {
    val math = Math()
    println(math.add(3, 7))
    println(math.mul(7, 5))
}

class Math {
    fun add(a: Int, b: Int) = a + b
    fun sub(a: Int, b: Int) = a - b
    fun mul(a: Int, b: Int) = a * b
    fun div(a: Int, b: Int) = a / b
}