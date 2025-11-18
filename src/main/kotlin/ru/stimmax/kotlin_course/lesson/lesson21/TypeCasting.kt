package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson21

import java.util.Locale.getDefault

fun main() {
    val obj: Any = "Hello, World!"
    if (obj is String) {
        println("Объект является строкой")
    }
    if (obj !is Int) {
        println("Объект не является целым числом")
    }

    if (obj is String) {
        // obj автоматически приведён к String
        println(obj.uppercase(getDefault())) // Метод toUpperCase() доступен, т.к. obj теперь String
    }

    val num: Any = 123
    num as String // Выбросит ClassCastException

    num as? String // safeStr будет равно null

    val nullableStr: String = "Kotlin"
    nullableStr as String // Явное приведение типа

    val mixedList: List<Any> = listOf("Kotlin", 42, 3.14, "Java", true)
    for (item in mixedList) {
        when (item) {
            is String -> println("$item - строка длиной ${item.length}")
            is Int -> println("$item - целое число")
            is Double -> println("$item - вещественное число")
            else -> println("Неизвестный тип")
        }
    }
}