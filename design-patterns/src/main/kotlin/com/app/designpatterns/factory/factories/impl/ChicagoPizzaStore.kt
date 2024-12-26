package com.app.com.app.designpatterns.factory.factories.impl

import com.app.com.app.designpatterns.factory.enums.PizzaType
import com.app.com.app.designpatterns.factory.factories.PizzaStoreFactory
import com.app.com.app.designpatterns.factory.pizzas.Pizza
import com.app.com.app.designpatterns.factory.pizzas.impl.ChicagoStyleCheesePizza
import com.app.com.app.designpatterns.factory.pizzas.impl.ChicagoStyleClamsPizza
import com.app.com.app.designpatterns.factory.pizzas.impl.ChicagoStylePepperoniPizza
import com.app.com.app.designpatterns.factory.pizzas.impl.ChicagoStyleVeggiePizza


class ChicagoPizzaStore: PizzaStoreFactory() {
    override fun orderPizza(type: String): Pizza {
        val pizza = createPizza(type)

        pizza.bake()
        pizza.cut()
        pizza.box()

        return pizza
    }

    override fun createPizza(type: String): Pizza {
        var pizza: Pizza?
        if(type.equals(PizzaType.CHEESE.name)) {
            println("Creating Chicago Style Cheese Pizza")
            pizza = ChicagoStyleCheesePizza()
        } else if(type.equals(PizzaType.PEPPERONI.name)) {
            println("Creating Chicago Style Pepperoni Pizza")
            pizza = ChicagoStylePepperoniPizza()
        } else if(type.equals(PizzaType.CLAM.name)) {
            println("Creating Chicago Style Clam Pizza")
            pizza = ChicagoStyleClamsPizza()
        } else if(type.equals(PizzaType.VEGGIE.name)) {
            println("Creating Chicago Style Veggie Pizza")
            pizza = ChicagoStyleVeggiePizza()
        } else {
            throw Exception("Invalid pizza type")
        }
        return pizza
    }
}