package com.app.com.app.designpatterns.abstractfactories.factories.impl

import com.app.com.app.designpatterns.abstractfactories.enums.PizzaType
import com.app.com.app.designpatterns.abstractfactories.factories.PizzaStoreFactory
import com.app.com.app.designpatterns.abstractfactories.pizza.Pizza
import com.app.com.app.designpatterns.abstractfactories.pizza.impl.CheesePizza
import com.app.com.app.designpatterns.abstractfactories.pizza.impl.ClamsPizza
import com.app.com.app.designpatterns.abstractfactories.pizza.impl.PepperoniPizza
import com.app.com.app.designpatterns.abstractfactories.pizza.impl.VeggiePizza

class ChicagoPizzaStore: PizzaStoreFactory() {
    override fun orderPizza(type: String): Pizza {
        val chicagoPizzaIngredientFactory = ChicagoPizzaIngredientFactory()

        var pizza: Pizza? = null
        if(type.equals(PizzaType.VEGGIE.name)) {
            pizza = VeggiePizza(chicagoPizzaIngredientFactory)
        } else if(type.equals(PizzaType.CLAM.name)) {
            pizza = ClamsPizza(chicagoPizzaIngredientFactory)
        } else if(type.equals(PizzaType.CHEESE.name)) {
            pizza = CheesePizza(chicagoPizzaIngredientFactory)
        } else if(type.equals(PizzaType.PEPPERONI.name)) {
            pizza = PepperoniPizza(chicagoPizzaIngredientFactory)
        } else {
            throw Exception("Invalid pizza type")
        }
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }
}