package com.app.coroutines

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main(args: Array<String>) {
    runBlocking {
        launch (CoroutineName("myCoroutine")) {
            println("This is run from ${coroutineContext.get(CoroutineName.Key)}")
        }

        GlobalScope.launch {

        }
    }
}