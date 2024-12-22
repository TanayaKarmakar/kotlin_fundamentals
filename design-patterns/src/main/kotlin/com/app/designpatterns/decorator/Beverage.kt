package com.app.com.app.designpatterns.decorator

abstract class Beverage {
    protected open var description: String = "Unknown Description"

    open fun getDesc(): String {
        return this.description
    }

    abstract fun cost(): Float
}