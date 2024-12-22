package com.app.com.app.designpatterns.decorator.impl

import com.app.com.app.designpatterns.decorator.Beverage
import com.app.com.app.designpatterns.decorator.CondimentDecorator

class SteamedMilk(val beverage: Beverage): CondimentDecorator() {
    override fun getDesc(): String {
        return "${beverage.getDesc()}, Steamed Milk"
    }

    override fun cost(): Float {
        return beverage.cost() + 0.10f
    }
}