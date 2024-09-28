package com.app.practice

import kotlin.random.Random

fun main(args: Array<String>) {
    val correctKey  = Lock.createKey()
    val myLock = Lock(correctKey)

    myLock.unclock(correctKey)

    val randomKey = Lock.createKey()
    myLock.unclock(randomKey)
}

class Lock(key: Key) {
    var secretCode: String

    init {
        secretCode = generateSecret()
        key.secretCode = secretCode
    }
    companion object {
        fun createKey() = Key()
    }

    fun generateSecret(): String {
        return Random(System.currentTimeMillis()).nextInt().toString()
    }

    fun unclock(key: Key) {
        if(key.secretCode == secretCode) {
            println("Lock is open")
        } else {
            println("Key is not correct")
        }
    }
}

class Key {
    var secretCode: String = ""

        set(value) {
            if(field == "")
                field = value
        }
}