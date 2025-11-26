package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson23.homeworks

fun main() {

}

// Создай функцию, которая принимает список чисел и возвращает среднее арифметическое всех чётных чисел этого списка.
// С помощью require проверь, что список не пустой.

fun evenAverage(list: List<Int>): Int {
    require(!list.isEmpty()) { "Пустой получается" }
    val evenNum = list.filter { it % 2 == 0 }
    return evenNum.sum() / evenNum.size
}

val evenAverage1 = fun(list: List<Int>): Int {
    require(!list.isEmpty()) { "Пустой получается" }
    val evenNum = list.filter { it % 2 == 0 }
    return evenNum.sum() / evenNum.size
}