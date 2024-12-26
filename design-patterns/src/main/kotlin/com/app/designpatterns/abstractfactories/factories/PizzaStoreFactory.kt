package com.app.com.app.designpatterns.abstractfactories.factories

import com.app.com.app.designpatterns.abstractfactories.pizza.Pizza

abstract class PizzaStoreFactory {
    abstract fun orderPizza(type: String): com.app.com.app.designpatterns.abstractfactories.pizza.Pizza

}