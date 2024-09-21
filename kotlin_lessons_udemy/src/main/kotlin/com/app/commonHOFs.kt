package com.app

fun main(args: Array<String>) {
    val clients = listOf("Anna", "Bob", "Alice", "Dan", "Michelle", "Carol")

    println("Filtered names")
    clients.filter { it.length < 5 }
            .forEach { println("Hello $it") }


    println("All names in list")
    clients.forEach { println("Hello $it") }


    val sizes = clients.map { it.length }
    println(sizes)

    //sorting list by name
    val updatedClients = clients.sortedBy { it.length }

    println("Updated clients $updatedClients")
}