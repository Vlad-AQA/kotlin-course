package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson16.homeworks

abstract class Shape() {
    open fun area(): Double {
        return 0.0
    }
}

fun main() {
    val circle = Circle(10.0)
    val square = Square(5.0)
    val triangle = Triangle(5.0, 5.0, 45.0)
    val figuresList = listOf(circle, square, triangle)
    for (i in figuresList) {
        i.area()
    }
}