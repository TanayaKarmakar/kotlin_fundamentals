package com.app.practice.standardFunctions

fun main(args: Array<String>) {
    Book().apply {
        printBook()
    }.also {
        println("LOG: Printing book $it")
        println("LOG: Sending an email about the book $it")
    }
}

class Book {
    fun printBook() {
        println("Printing a book")
    }
}
