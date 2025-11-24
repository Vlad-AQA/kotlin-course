package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson22.homeworks

// Создай свой тип исключения в отдельном файле,
// наследуемый от AssertionError и принимающий текст. Выброси это исключение в main

class MyExcep(message: String) : AssertionError(message)

fun main() {
    throw MyExcep("Тут мессага")
}