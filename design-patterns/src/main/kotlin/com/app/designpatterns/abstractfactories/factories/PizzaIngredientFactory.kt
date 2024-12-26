package com.app.com.app.designpatterns.abstractfactories.factories

import com.app.com.app.designpatterns.abstractfactories.ingredients.*


interface PizzaIngredientFactory {
    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createVeggies(): List<Veggies>
    fun createClams(): Clams
    fun createPepperoni(): Pepperoni
    fun createCheese(): Cheese
}