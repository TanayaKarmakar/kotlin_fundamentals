package com.app.com.app.designpatterns.strategy.impl

import com.app.com.app.designpatterns.strategy.FlyBehaviour

class FlyWithWings: FlyBehaviour {
    override fun fly() {
        println("I am flying with wings")
    }
}