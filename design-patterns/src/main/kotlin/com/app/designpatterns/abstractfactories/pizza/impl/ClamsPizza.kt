package com.app.com.app.designpatterns.abstractfactories.pizza.impl

import com.app.com.app.designpatterns.abstractfactories.factories.PizzaIngredientFactory
import com.app.com.app.designpatterns.abstractfactories.pizza.Pizza

class ClamsPizza(val pizzaIngredientFactory: com.app.com.app.designpatterns.abstractfactories.factories.PizzaIngredientFactory): com.app.com.app.designpatterns.abstractfactories.pizza.Pizza() {
    override fun preparePizza() {
        this.dough = pizzaIngredientFactory.createDough()
        this.sauce = pizzaIngredientFactory.createSauce()
        this.clam = pizzaIngredientFactory.createClams()
        this.cheese = pizzaIngredientFactory.createCheese()
    }
}