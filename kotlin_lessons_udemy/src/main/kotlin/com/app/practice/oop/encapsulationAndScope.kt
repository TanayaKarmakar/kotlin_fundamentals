package com.app.practice.oop

fun main(args: Array<String>) {
    val myLock = EncryptionLock(40)

    println("Does the key 70 unlock myLock ${myLock.unlock(70)}")
    println("Does the key 35 unlock myLock ${myLock.unlock(35)}")
    println("Does the key 89 unlock myLock ${myLock.unlock(89)}")
    println("Does the key 136 unlock myLock ${myLock.unlock(136)}")
}

class EncryptionLock(private val privateKey: Int) {
     fun unlock(publicKey: Int) = formula(publicKey) == privateKey

     private fun formula(publicKey: Int): Int {
        return publicKey / 2 + 5
     }


}