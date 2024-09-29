package com.app.practice.standardFunctions

fun main(args: Array<String>) {
    println("Input a number")

    val input: String? = readLine()

    input?.let {
        val number = it.toInt()

        println("the double of the number is ${number * 2}")
    }


    val animals = mutableListOf<String?>()

    for(i in 1..3) {
        println("Input an animal")
        val input: String?= readLine()
        input?.let {
            if(it == "") {
                animals.add(null)
            } else {
                animals.add(it)
            }
        }
    }

    animals.forEach {
        println("Feeding the $it")
    }

}