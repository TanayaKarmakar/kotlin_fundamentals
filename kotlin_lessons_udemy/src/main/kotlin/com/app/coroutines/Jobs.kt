package com.app.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main(args: Array<String>) {
    runBlocking {
        val job1 = launch {
            delay(3000L)
            println("Job1 launched")
        }

        delay(500L)
        job1.invokeOnCompletion {
            println("Job1 is completed")
        }

        println("Job1 will be cancelled")
        job1.cancel()
    }
}