package com.app

fun main(args: Array<String>) {
    println("Enter first Input")
    val str1 = readLine()

    println("Enter second Input")
    val str2 = readLine()
    //val sum = num1?.toInt() + num2?.toInt()

    println("First Input $str1")
    println("Second Input $str2")

    initCalc()

}

fun initCalc() {
    println("Enter the first number")
    var num1Str = readLine()?:""
    if(num1Str == "") {
        num1Str = "0"
    }

    println("Enter the second number")
    var num2Str = readLine()?:""
    if(num2Str == "") {
        num2Str = "0"
    }

    println("Enter the operator")
    val op = readLine()?:""

    val num1 = num1Str.toInt()
    val num2 = num2Str.toInt()

    if(op == "+") {
        println("Result is ${num1 + num2}")
    } else if(op == "-") {
        println("Result is ${num1 - num2}")
    } else if(op == "*") {
        println("Result is ${num1 * num2}")
    } else if(op == "/") {
        println("Result is ${num1 / num2}")
    } else {
        println("Incorrect details")
    }
}