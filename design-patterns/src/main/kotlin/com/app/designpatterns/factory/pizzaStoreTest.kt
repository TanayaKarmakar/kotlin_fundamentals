package com.app.com.app.designpatterns.factory

import com.app.com.app.designpatterns.factory.enums.PizzaType
import com.app.com.app.designpatterns.factory.factories.impl.ChicagoPizzaStore
import com.app.com.app.designpatterns.factory.factories.impl.NYPizzaStore

fun main(args: Array<String>) {
    val nyPizzaStore = NYPizzaStore()

    println("Preparing NY Style pizza")
    val nyStylePizza = nyPizzaStore.orderPizza(PizzaType.VEGGIE.name)


    println("***************************************")
    val chicagoPizzaStore = ChicagoPizzaStore()
    println("Preparing Chicago Style Pizza")

    val chicagoStyleClamsPizza = chicagoPizzaStore.orderPizza(PizzaType.CLAM.name)
}