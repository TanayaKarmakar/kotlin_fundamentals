package com.app.com.app.designpatterns.strategy.impl

import com.app.com.app.designpatterns.strategy.QuackBehaviour

class MuteQuack: QuackBehaviour {
    override fun quack() {
        println("<<Silence>>")
    }
}