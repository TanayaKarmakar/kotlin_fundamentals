package com.app.com.app.designpatterns.strategy.impl

import com.app.com.app.designpatterns.strategy.QuackBehaviour

class Squeak: QuackBehaviour {
    override fun quack() {
        println("Squeak")
    }
}