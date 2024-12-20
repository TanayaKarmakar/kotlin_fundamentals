package com.app.com.app.designpatterns.strategy.impl

import com.app.com.app.designpatterns.strategy.Duck

class MallardDuck: Duck {
   constructor() {
       this.flyBehaviour = FlyWithWings()
       this.quackBehaviour = Quack()
   }
}