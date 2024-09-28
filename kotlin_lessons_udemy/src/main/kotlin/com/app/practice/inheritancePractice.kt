package com.app.practice

fun main(args: Array<String>) {
    val parakeet = Parakeet()
    parakeet.fly()
}

open class Bird {
    open val color = "grey"
    open val speed = 50

    open fun fly() {
        println("A $color bird can fly upto $speed km/hr")
    }
}

class Parakeet: Bird() {
    override val color = "green"
    override val speed = 65

    override fun fly() {
        super.fly()
        println("A ${super.color} bird can fly upto ${super.speed} km/ph")
    }
}