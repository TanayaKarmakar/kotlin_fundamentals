package com.app.com.app.designpatterns.abstractfactories.pizza.impl

import com.app.com.app.designpatterns.abstractfactories.factories.PizzaIngredientFactory
import com.app.com.app.designpatterns.abstractfactories.pizza.Pizza

class CheesePizza(val pizzaIngredientFactory: com.app.com.app.designpatterns.abstractfactories.factories.PizzaIngredientFactory): com.app.com.app.designpatterns.abstractfactories.pizza.Pizza() {
    override fun preparePizza() {
        this.dough = pizzaIngredientFactory.createDough()
        this.cheese = pizzaIngredientFactory.createCheese()
        this.sauce = pizzaIngredientFactory.createSauce()
    }
}