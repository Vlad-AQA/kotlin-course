package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson16.homeworks

import kotlin.math.sin

class Triangle(
    val sideA: Double,
    val sideB: Double,
    val cornerAB: Double
) : Shape() {
    override fun area(): Double {
        val s = 0.5 * sideA * sideB * sin(cornerAB)
        println(s)
        return s
    }
}