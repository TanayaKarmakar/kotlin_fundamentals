package com.app.com.app.designpatterns.strategy

import com.app.com.app.designpatterns.strategy.impl.FlyWithRocket
import com.app.com.app.designpatterns.strategy.impl.MallardDuck
import com.app.com.app.designpatterns.strategy.impl.RocketPoweredDuck
import com.app.com.app.designpatterns.strategy.impl.Squeak

fun main(args: Array<String>) {
    val mDuck = MallardDuck()
    mDuck.performFly()
    mDuck.performQuack()

    val rocketPoweredDuck = RocketPoweredDuck()
    rocketPoweredDuck.applyFlyBehaviour(FlyWithRocket())
    rocketPoweredDuck.applyQuackBehaviour(Squeak())

    rocketPoweredDuck.performFly()
    rocketPoweredDuck.performQuack()
}