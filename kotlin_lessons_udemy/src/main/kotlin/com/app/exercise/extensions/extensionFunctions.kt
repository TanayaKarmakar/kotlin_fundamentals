package com.app.exercise.extensions

fun main(args: Array<String>) {
    val list = arrayListOf(3,5,7,2,88,928,17,29,80)

    println(list.howMany())
}

fun ArrayList<Int>.howMany() = "This list contains $size elements"