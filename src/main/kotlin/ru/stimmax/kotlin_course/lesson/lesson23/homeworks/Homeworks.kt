package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson23.homeworks

fun main() {

    // Создай аналогичную анонимную функцию.
    fun(list: List<Int>): Int {
        require(list.isNotEmpty()) { "Пустой получается" }
        val evenNum = list.filter { it % 2 == 0 }
        return evenNum.sum() / evenNum.size
    }
//Создай аналогичное лямбда выражение с указанием типа.
    val evenAverage1: (List<Int>) -> Int = { list ->
        require(list.isNotEmpty()) { "Пустой получается" }
        val evenNum = list.filter { it % 2 == 0 }
        evenNum.sum() / evenNum.size
    }

//Создай лямбда выражение без указания типа.
    val evenAverage2 = { list: List<Int> ->
        require(list.isNotEmpty()) { "Пустой получается" }
        val evenNum = list.filter { it % 2 == 0 }
        evenNum.sum() / evenNum.size
    }

    listOf<Int>()
    val list2 = listOf<Int>(2, 4, 5, 7, 6, 8, 9, 10)
    println(evenAverage2(list2))
}

// Создай функцию, которая принимает список чисел и возвращает среднее арифметическое всех чётных чисел этого списка.
// С помощью require проверь, что список не пустой.

fun evenAverage(list: List<Int>): Int {
    require(!list.isEmpty()) { "Пустой получается" }
    val evenNum = list.filter { it % 2 == 0 }
    return evenNum.sum() / evenNum.size
}

// Создай аналогичную анонимную функцию

