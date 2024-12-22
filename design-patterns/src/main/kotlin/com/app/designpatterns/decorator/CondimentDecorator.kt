package com.app.com.app.designpatterns.decorator

abstract class CondimentDecorator: Beverage() {
    abstract override fun getDesc(): String
}