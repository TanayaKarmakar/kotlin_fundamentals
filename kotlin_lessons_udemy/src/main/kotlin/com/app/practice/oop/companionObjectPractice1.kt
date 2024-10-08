package com.app.practice.oop

fun main(args: Array<String>) {
    val course = KotlinCourse()
    course.getCourseInfo()

    KotlinCourse.getCourseMetaInfo()
}

class KotlinCourse {
    fun getCourseInfo() {
        println("Kotlin is a Java Based development language")
    }

    companion object {
        fun getCourseMetaInfo() {
            println("Kotlin is not a difficult language to learn")
        }
    }
}