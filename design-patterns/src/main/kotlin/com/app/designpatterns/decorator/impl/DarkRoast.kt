package com.app.com.app.designpatterns.decorator.impl

import com.app.com.app.designpatterns.decorator.Beverage

class DarkRoast(val beverage: Beverage?): Beverage() {
    override var description: String = "Dark Roast"

    override fun cost(): Float {
        return 0.99f
    }
}