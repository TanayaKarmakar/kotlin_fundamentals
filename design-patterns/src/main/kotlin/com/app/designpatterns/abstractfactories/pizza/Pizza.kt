package com.app.com.app.designpatterns.abstractfactories.pizza

import com.app.com.app.designpatterns.abstractfactories.ingredients.*

abstract class Pizza {
    protected var dough: Dough? = null
    protected var cheese: Cheese?= null
    protected var sauce: Sauce?= null
    protected var veggies: List<Veggies>? = null
    protected var clam: Clams?= null
    protected var pepperoni: Pepperoni?= null

    abstract fun preparePizza()

    fun bake() {
        println("Baking the pizza for 25 minutes at 350")
    }

    fun cut() {
        println("Cutting the pizza into diagonal slices")
    }

    fun box() {
        println("Placing the pizza into official PizzaStore box")
    }

}