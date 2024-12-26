package com.app.com.app.designpatterns.abstractfactories

import com.app.com.app.designpatterns.abstractfactories.enums.PizzaType
import com.app.com.app.designpatterns.abstractfactories.factories.impl.NYPizzaStore

fun main(args: Array<String>) {
    val nyPizzaStore = NYPizzaStore()
    val veggiePizza = nyPizzaStore.orderPizza(PizzaType.VEGGIE.name)

}