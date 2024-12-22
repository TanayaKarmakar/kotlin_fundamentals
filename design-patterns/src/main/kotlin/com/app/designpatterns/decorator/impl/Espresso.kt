package com.app.com.app.designpatterns.decorator.impl

import com.app.com.app.designpatterns.decorator.Beverage

class Espresso(val beverage: Beverage?): Beverage() {
    override var description: String = "Espresso"

    override fun cost(): Float {
        return 1.99f
    }
}