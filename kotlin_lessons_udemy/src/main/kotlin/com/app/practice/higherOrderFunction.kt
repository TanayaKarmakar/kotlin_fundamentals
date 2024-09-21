package com.app.practice

fun main(args: Array<String>) {
    val numbers = arrayListOf(3,8,6,9,19,65, 18, 3764, 37)
    println("Before update")
    println(numbers)

    val newNumbers: ArrayList<Int> = update(numbers) {number -> number / 10}

    println("Updated list")
    println(newNumbers)
}

fun update(numbers: ArrayList<Int>, lbd: (Int) -> Int): ArrayList<Int> {
    for(i in 0..numbers.size - 1) {
        if(numbers[i] % 2 == 0)
            numbers[i] = lbd(numbers[i])
    }
    return numbers
}