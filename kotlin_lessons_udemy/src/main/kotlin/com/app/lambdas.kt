package com.app

fun main(args: Array<String>) {
    val myLambda = {name: String -> println("Hello $name")}
    val names = arrayListOf("Tom", "William", "Harry", "Jenny", "Stephen")

    sayHello(names, myLambda)
}

fun sayHello(names: ArrayList<String>, handlerFunction: (String) -> Unit) {
    for(name in names) {
        handlerFunction(name)
    }
}