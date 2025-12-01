package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson23.homeworks


// Создай функцию-расширение списка чисел, которая будет возвращать множество дубликатов чисел
// (встречающихся в списке более одного раза).
// Создай аналогичную анонимную функцию.
// Создай аналогичное лямбда выражение с указанием типа.
// Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.

// Вариант 1 аналогично 2 варианту
fun List<Int>.dist(): Set<Int> {
    val list = this
    val list2 = toSet().toList()
    val result = list - list2
    return result.toSet()
}

// Вариант 2 неверный так как получим пустой список в итоге
fun List<Int>.dist2(): Set<Int> {
    return (this - toSet().toList()).toSet()
}

fun main() {
    // Создай аналогичную анонимную функцию.
    val d1 = fun List<Int>.(): Set<Int> {
        return toSet().associate { element ->
            element to this.count { it == element }
        }.filter { it.value > 1 }
            .keys
    }

    val listt = listOf(1, 2, 2, 3, 3, 3, 4, 5)
    println(listt.d1())
}