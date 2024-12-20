package com.app.com.app.designpatterns.observer.observers.impl

import com.app.com.app.designpatterns.observer.observers.DisplayElement
import com.app.com.app.designpatterns.observer.observers.Observer
import com.app.com.app.designpatterns.observer.publisher.Subject

class CurrentConditionsDisplay(val subject: Subject): Observer, DisplayElement {
    private var temperature: Float = 0f
    private var humidity: Float = 0f
    private var pressure: Float = 0f

    init {
        subject.registerObserver(this)
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        display()
    }

    override fun display() {
        println("CurrentConditionsDisplay: Temperature: $temperature, Pressure: $pressure, Humidity: $humidity")
    }
}