package com.app.oop

fun main(args: Array<String>) {
    var myDoggie = Corgi()

    myDoggie.size = 10
    println("${myDoggie.size}")

    myDoggie.bark()
    myDoggie.play()
}

open class Dog {
    var size = 0

    fun bark() {
        println("Bark")
    }

    fun play() {
        println("Play")
    }
}

class Corgi: Dog() {

}