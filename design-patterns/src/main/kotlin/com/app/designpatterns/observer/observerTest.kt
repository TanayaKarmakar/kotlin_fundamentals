package com.app.com.app.designpatterns.observer

import com.app.com.app.designpatterns.observer.observers.impl.CurrentConditionsDisplay
import com.app.com.app.designpatterns.observer.publisher.impl.WeatherData

fun main(args: Array<String>) {
    val weatherData = WeatherData()

    val currentConditionsDisplay = CurrentConditionsDisplay(weatherData)

    weatherData.setMeasurements(10f, 29f,10f)
}