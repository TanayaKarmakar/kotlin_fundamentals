package com.app.com.app.designpatterns.strategy.impl

import com.app.com.app.designpatterns.strategy.FlyBehaviour

class FlyWithRocket: FlyBehaviour {
    override fun fly() {
        println("Rocket powered Duck")
    }
}