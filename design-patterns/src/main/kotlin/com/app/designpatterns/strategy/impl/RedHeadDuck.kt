package com.app.com.app.designpatterns.strategy.impl

import com.app.com.app.designpatterns.strategy.Duck

class RedHeadDuck: Duck {
    constructor() {
        this.flyBehaviour = FlyNoWay()
        this.quackBehaviour = Squeak()
    }
}