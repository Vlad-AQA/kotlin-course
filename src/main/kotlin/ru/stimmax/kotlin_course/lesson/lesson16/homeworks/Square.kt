package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson16.homeworks


class Square(

    val side: Double

) : Shape() {
    override fun area(): Double {
        val s = side * side
        println(s)
        return s
    }
}