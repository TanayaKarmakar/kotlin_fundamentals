package com.app.exercise.standardFunctions

fun main(args: Array<String>) {
    val clients = arrayListOf<String?>()

    do {
        println("Enter client name")
        val input: String? = readLine()
        input.let {
            if(it?.lowercase() != "stop") {
                if (it == "") {
                    clients.add(null)
                } else {
                    clients.add(input)
                }
            }
        }
    } while(input?.lowercase() != "stop")

    println("Clients $clients")

    clients.forEach {
        it?.let {
            println("Hello $it")
        }
    }

}