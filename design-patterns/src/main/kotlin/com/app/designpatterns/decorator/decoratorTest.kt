package com.app.com.app.designpatterns.decorator

import com.app.com.app.designpatterns.decorator.impl.HouseBlend
import com.app.com.app.designpatterns.decorator.impl.Mocha
import com.app.com.app.designpatterns.decorator.impl.Whip

fun main(args: Array<String>) {
    var beverage: Beverage = HouseBlend(null)
    beverage = Mocha(beverage)
    beverage = Mocha(beverage)
    beverage = Whip(beverage)

    println(beverage.getDesc())
    println(beverage.cost())
}