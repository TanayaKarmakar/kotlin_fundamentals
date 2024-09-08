package com.app

fun main(args: Array<String>) {
    val colors = arrayListOf("Red", "Green", "Blue")
    println(colors)

    colors.add("Yellow")
    colors.add("Pink")

    println("Updated color list $colors")

    colors.remove("Red")

    println("Updated color list $colors")
}