package com.app.com.app.designpatterns.strategy

abstract class Duck {
    protected lateinit var flyBehaviour: FlyBehaviour
    protected lateinit var quackBehaviour: QuackBehaviour

    fun applyFlyBehaviour(flyBehaviour: FlyBehaviour) {
        this.flyBehaviour = flyBehaviour
    }

    fun applyQuackBehaviour(quackBehaviour: QuackBehaviour) {
        this.quackBehaviour = quackBehaviour
    }

    fun performFly() {
        flyBehaviour.fly()
    }
    
    fun performQuack() {
        quackBehaviour.quack()
    }

    fun float() {
        println("All Ducks can float")
    }

}