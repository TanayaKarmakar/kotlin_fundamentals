package com.app.com.app.designpatterns.decorator.impl

import com.app.com.app.designpatterns.decorator.Beverage

class HouseBlend(val beverage: Beverage?): Beverage() {
    override var description = "HouseBlend"

    override fun cost(): Float {
        return 0.89f
    }
}