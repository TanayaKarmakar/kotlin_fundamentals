package com.app.oop

fun main(args: Array<String>) {
    //var myCar = Car1("BMW", 220)


    val myCar = Car2()
    val yourCar = Car2("BMW")
    val hisCar = Car2("Fiat", 220)
}

class Car1(var model: String, var topSpeed: Int) {

}

class Car2 {
    var model: String?= null
    var topSpeed = 100

    constructor() {
        model = "No Model"
        topSpeed = 150
    }

    constructor(newModel: String) {
        model = newModel
        topSpeed = 150
    }

    constructor(newModel: String, topSpeed: Int) {
        model = newModel
        this.topSpeed = topSpeed
    }
}