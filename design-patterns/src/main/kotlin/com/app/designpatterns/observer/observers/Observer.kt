package com.app.com.app.designpatterns.observer.observers

interface Observer {
    fun update(temperature: Float, humidity: Float, pressure: Float)
}