package com.app.com.app.designpatterns.factory.factories

import com.app.com.app.designpatterns.factory.pizzas.Pizza

abstract class PizzaStoreFactory {

    abstract fun orderPizza(type: String): Pizza
    abstract fun createPizza(type: String): Pizza
}