package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson23.homeworks


// Создай функцию-расширение списка чисел, которая будет возвращать множество дубликатов чисел
// (встречающихся в списке более одного раза).
// Создай аналогичную анонимную функцию.
// Создай аналогичное лямбда выражение с указанием типа.
// Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.

// Вариант 1
fun List<Int>.dist(): Set<Int> {
    val list = this
    val list2 = toSet().toList()
    val result = list - list2
    return result.toSet()
}

// Вариант 2
fun List<Int>.dist2(): Set<Int> {
    return (this - toSet().toList()).toSet()
}

fun main() {
    // Создай аналогичную анонимную функцию.
    val dist3 = fun List<Int>.(): Set<Int> {
        return (this - toSet().toList()).toSet()
    }
    dist3(listOf())
}