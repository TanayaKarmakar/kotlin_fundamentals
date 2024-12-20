package com.app.coroutines

import kotlinx.coroutines.*

fun main(args: Array<String>) {
    runBlocking {
        launch {
            delay(1000L)
            println("Task from runBlocking")
        }

        GlobalScope.launch {
            delay(500L)
            println("Task from GlobalScope")
        }

        coroutineScope {
            launch {
                delay(1500L)
                println("Task from CoroutineScope")
            }
        }
    }

    println("Program execution will continue")
}