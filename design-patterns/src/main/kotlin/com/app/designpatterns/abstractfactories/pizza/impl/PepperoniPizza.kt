package com.app.com.app.designpatterns.abstractfactories.pizza.impl

import com.app.com.app.designpatterns.abstractfactories.factories.PizzaIngredientFactory
import com.app.com.app.designpatterns.abstractfactories.pizza.Pizza

class PepperoniPizza(val pizzaIngredientFactory: com.app.com.app.designpatterns.abstractfactories.factories.PizzaIngredientFactory): com.app.com.app.designpatterns.abstractfactories.pizza.Pizza() {
    override fun preparePizza() {
        this.dough = pizzaIngredientFactory.createDough()
        this.veggies = pizzaIngredientFactory.createVeggies()
        this.pepperoni = pizzaIngredientFactory.createPepperoni()
        this.cheese = pizzaIngredientFactory.createCheese()
    }
}