package com.app.oop

fun main(args: Array<String>) {
    val somePlant = getPlant()
    when(somePlant) {
        is Fruit -> println("Sweet fruit")
        is Vegetables -> println("Tasty veggies")
    }
}

fun getPlant(): Plant = Apple()

abstract class Plant

sealed class Fruit: Plant()

sealed class Vegetables: Plant()

class Apple: Fruit()

class Potato: Vegetables()