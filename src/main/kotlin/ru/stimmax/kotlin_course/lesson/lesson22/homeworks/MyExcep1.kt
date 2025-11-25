package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson22.homeworks

class MyExcep1(cause: IndexOutOfBoundsException) : RuntimeException(cause)

fun listIndexOff(list: List<String>, index: Int) {
    if (list.lastIndex < index) {
        throw MyExcep1(
            cause = IndexOutOfBoundsException()
        )
    }
}

fun main() {
    try {
        listIndexOff(listOf("", "2"), 3)
    } catch (e: MyExcep1) {
        println("Вышли за рамки списка")
    }
}