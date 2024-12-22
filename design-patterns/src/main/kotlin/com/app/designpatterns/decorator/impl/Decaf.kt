package com.app.com.app.designpatterns.decorator.impl

import com.app.com.app.designpatterns.decorator.Beverage

class Decaf(val beverage: Beverage?): Beverage() {
    override var description: String = "Decaf"


    override fun cost(): Float {
        return 1.05f
    }
}