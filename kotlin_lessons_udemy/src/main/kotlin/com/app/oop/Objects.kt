package com.app.oop

fun main(args: Array<String>) {
    if(DatabaseAccess.connected) {
        DatabaseAccess.disconnect()
    } else {
        DatabaseAccess.connect()
    }

    println("Database is connected: ${DatabaseAccess.connected}")
}

object DatabaseAccess {
    var connected = false

    fun connect() {
        connected = true
        println("Connected to the database")
    }

    fun disconnect() {
        connected = false
        println("Discconnected from the database")
    }
}