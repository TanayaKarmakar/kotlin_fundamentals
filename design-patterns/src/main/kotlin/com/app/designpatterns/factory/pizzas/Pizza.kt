package com.app.com.app.designpatterns.factory.pizzas

abstract class Pizza {
    fun bake() {
        println("Baking the pizza for 25 minutes at 350")
    }

    fun cut() {
        println("Cutting the pizza")
    }

    fun box() {
        println("Putting the pizza into box")
    }
}