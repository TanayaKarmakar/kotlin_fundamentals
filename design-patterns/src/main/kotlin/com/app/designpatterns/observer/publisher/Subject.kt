package com.app.com.app.designpatterns.observer.publisher

import com.app.com.app.designpatterns.observer.observers.Observer

interface Subject {
    fun registerObserver(observer: Observer)

    fun removeObserver(observer: Observer)

    fun notifyObservers()
}