package com.app.com.app.designpatterns.abstractfactories.factories.impl

import com.app.com.app.designpatterns.abstractfactories.factories.PizzaIngredientFactory
import com.app.com.app.designpatterns.abstractfactories.ingredients.*
import com.app.com.app.designpatterns.abstractfactories.ingredients.impl.*

class NYPizzaIngredientFactory: PizzaIngredientFactory {
    override fun createDough(): Dough {
        return ThinCrustDough()
    }

    override fun createSauce(): Sauce {
        return MarinaraSauce()
    }

    override fun createVeggies(): List<Veggies> {
        return listOf(
            Garlic(),
            Onion(),
            Mushroom(),
            RedPepper()
        )
    }

    override fun createClams(): Clams {
        return FreshClams()
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }

    override fun createCheese(): Cheese {
        return ReggianoCheese()
    }
}