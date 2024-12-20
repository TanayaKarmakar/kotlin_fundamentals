package com.app.com.app.designpatterns.observer.publisher.impl

import com.app.com.app.designpatterns.observer.observers.Observer
import com.app.com.app.designpatterns.observer.publisher.Subject

class WeatherData: Subject {
    private val observers = mutableListOf<Observer>()
    private var temperature: Float = 0f
    private var humidity: Float = 0f
    private var pressure: Float = 0f
    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        observers.forEach {
            it.update(temperature, humidity, pressure)
        }
    }

    fun measurementsChanged() {
        notifyObservers()
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature= temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }
}