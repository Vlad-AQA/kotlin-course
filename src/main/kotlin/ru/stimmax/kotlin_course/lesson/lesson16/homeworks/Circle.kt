package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson16.homeworks

import kotlin.math.PI

class Circle(

    val r: Double

) : Shape() {
    override fun area(): Double {
        val s = PI * r * r
        println(s)
        return s
    }
}