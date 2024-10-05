package com.app.extensions

fun main(args: Array<String>) {
    val name = "Tanaya"
    println(name.slim())
}

fun String.slim() = this.substring(1, length - 1)