package com.app.com.app.designpatterns.factory.factories.impl

import com.app.com.app.designpatterns.factory.enums.PizzaType
import com.app.com.app.designpatterns.factory.factories.PizzaStoreFactory
import com.app.com.app.designpatterns.factory.pizzas.Pizza
import com.app.com.app.designpatterns.factory.pizzas.impl.NYStyleCheesePizza
import com.app.com.app.designpatterns.factory.pizzas.impl.NYStyleClamsPizza
import com.app.com.app.designpatterns.factory.pizzas.impl.NYStylePepperoniPizza
import com.app.com.app.designpatterns.factory.pizzas.impl.NYStyleVeggiePizza

class NYPizzaStore: PizzaStoreFactory() {
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
            println("Creating NY Style Cheese Pizza")
            pizza = NYStyleCheesePizza()
        } else if(type.equals(PizzaType.PEPPERONI.name)) {
            println("Creating NY Style Pepperoni Pizza")
            pizza = NYStylePepperoniPizza()
        } else if(type.equals(PizzaType.CLAM.name)) {
            println("Creating NY Style Clam Pizza")
            pizza = NYStyleClamsPizza()
        } else if(type.equals(PizzaType.VEGGIE.name)) {
            println("Creating NY Style Veggie Pizza")
            pizza = NYStyleVeggiePizza()
        } else {
            throw Exception("Invalid pizza type")
        }
        return pizza
    }
}