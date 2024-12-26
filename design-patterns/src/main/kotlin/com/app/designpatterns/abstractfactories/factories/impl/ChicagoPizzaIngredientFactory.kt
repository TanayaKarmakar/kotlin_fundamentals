package com.app.com.app.designpatterns.abstractfactories.factories.impl

import com.app.com.app.designpatterns.abstractfactories.factories.PizzaIngredientFactory
import com.app.com.app.designpatterns.abstractfactories.ingredients.*
import com.app.com.app.designpatterns.abstractfactories.ingredients.impl.*

class ChicagoPizzaIngredientFactory: PizzaIngredientFactory {
    override fun createDough(): Dough {
        return ThickCrustDough()
    }

    override fun createSauce(): Sauce {
        return PlumTomatoSauce()
    }

    override fun createVeggies(): List<Veggies> {
        return listOf(
            BlackOlives(),
            Spinach(),
            EggPlant()
        )
    }

    override fun createClams(): Clams {
        return FrozenClams()
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }

    override fun createCheese(): Cheese {
        return MozzarellaCheese()
    }
}