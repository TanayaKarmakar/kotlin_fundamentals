package com.app.practice

fun main(args: Array<String>) {
    println("Please enter a number")
    val inputNumber = readLine()?:"0"

    val myBytes = inputNumber.toByte()

    println("MyBytes : $myBytes")
    println("Type ${myBytes::class.java}")

    val myShort = inputNumber.toShort()
    println("MyShorts : $myShort")
    println("Type ${myShort::class.java}")
}