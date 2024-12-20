package com.app.com.app.designpatterns.strategy.impl

import com.app.com.app.designpatterns.strategy.FlyBehaviour

class FlyNoWay: FlyBehaviour {
    override fun fly() {
        println("I can't fly")
    }
}