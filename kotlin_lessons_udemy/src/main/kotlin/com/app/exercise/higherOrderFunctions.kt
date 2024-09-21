package com.app.exercise

fun main(args: Array<String>) {
    val clients = arrayListOf("Michael", "James", "Dan", "Michelle")

    println(clients)

    val messages = getMessages(clients) {name -> "Hello $name, how are you ?"}

    println(messages)
}

fun getMessages(clients: Collection<String>, getMessage: (String) -> String): ArrayList<String> {
    val messages = arrayListOf<String>()

    for(client in clients) {
        messages.add(getMessage(client))
    }

    return messages
}