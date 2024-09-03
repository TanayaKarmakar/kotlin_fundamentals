package com.app

fun main(args: Array<String>) {
    var catName: String? = null
    println(catName?:"This cat has no name")

    catName = "Chonkers"
    println("Cats name is $catName")
}