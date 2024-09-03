package com.app

fun main(args: Array<String>) {
    var a: Int? = 3

    println(a?.plus(10))
    println(a?.minus(3))
    println(a?.times(7))
    println(a?.div(5))
    println(a?.rem(2))
}