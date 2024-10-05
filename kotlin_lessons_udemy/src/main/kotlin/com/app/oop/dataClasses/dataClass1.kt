package com.app.oop.dataClasses

fun main(args: Array<String>) {
    val myUser = User("John", "john@gmail.com", "john123")
    println(myUser)


    val myUser2 = User("John", "john@gmail.com", "john123")
    println(myUser == myUser2)
}

data class User(
        val userName: String,
        val email: String,
        val password: String
)