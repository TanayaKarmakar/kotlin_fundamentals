package com.app.practice

fun main(args: Array<String>) {
    val myDog: Dog = Pug("pug")
    val yourDog: Dog = BassetHound("Basset Hound")
    val hisDog: Dog = Chihuahua("chihuahua")

    myDog.run()
    myDog.bark()
    myDog.play()


    yourDog.run()
    yourDog.bark()
    yourDog.play()

    hisDog.run()
    hisDog.bark()
    hisDog.play()
}

abstract class Dog(name: String) {
    abstract fun run()
    abstract fun bark()
    abstract fun play()
}

class Pug(val name: String): Dog(name) {
    override fun run() {
        println("A $name can run")
    }

    override fun bark() {
        println("A $name CANNOT bark")
    }

    override fun play() {
        println("A $name can play")
    }
}

class BassetHound(val name: String): Dog(name) {
    override fun run() {
        println("A $name CANNOT run")
    }

    override fun bark() {
        println("A $name can bark")
    }

    override fun play() {
        println("A $name can play")
    }
}

class Chihuahua(val name: String): Dog(name) {
    override fun run() {
        println("A $name CANNOT run")
    }

    override fun bark() {
        println("A $name can definitely bark")
    }

    override fun play() {
        println("A $name CANNOT play")
    }

}