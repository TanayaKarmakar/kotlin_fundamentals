package com.app.practice

fun main(args: Array<String>) {
    println("What is your name")
    val userName = readLine()

    println("Welcome $userName")

    println("Please enter a number")
    val number = readLine()?:""
    val result = number.toInt() * 5

    println("$number * 5 is $result")

    println("Please enter birth year")
    val birthYear = readLine()?:""

    val year = birthYear.toInt()
    val age = 2024 - year
    println("Your age is $age")
}