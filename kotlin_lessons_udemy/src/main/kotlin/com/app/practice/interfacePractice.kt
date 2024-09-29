package com.app.practice

fun main(args: Array<String>) {
    val restaurant1: Restaurant = LocalRestaurant()
    restaurant1.provideFood()
    restaurant1.provideBill()


    val restaurant2: Restaurant = FancyRestaurant()
    restaurant2.provideFood()
    restaurant2.provideBill()
}

interface Restaurant {
    fun provideFood()
    fun provideBill()
}

class LocalRestaurant: Restaurant {
    override fun provideFood() {
        println("Your local restaurant provide food and drinks")
    }

    override fun provideBill() {
        println("Please pay 25")
    }
}

class FancyRestaurant: Restaurant {
    override fun provideFood() {
        println("This is the most delicious food I have ever tried")
    }

    override fun provideBill() {
        println("Please pay 100")
    }
}