package com.app.coroutines

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@OptIn(DelicateCoroutinesApi::class)
fun main(args: Array<String>) {
    GlobalScope.launch {
        delay(1000L)
        println("world!")
    }

    print("Hello, ")
    Thread.sleep(2000L)
}