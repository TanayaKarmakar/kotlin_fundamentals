package com.app.com.app.designpatterns.strategy.impl

import com.app.com.app.designpatterns.strategy.QuackBehaviour

class Quack : QuackBehaviour {
    override fun quack() {
        println("Quack")
    }
}