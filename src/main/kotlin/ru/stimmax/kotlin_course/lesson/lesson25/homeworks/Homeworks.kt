package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson25.homeworks

// Создайте функцию timeTracker, которая принимает другую функцию в качестве аргумента
// и измеряет время её выполнения. Функция timeTracker должна возвращать затраченное время в миллисекундах.
// Для измерения времени используйте System.currentTimeMillis() до и после выполнения переданной функции.
fun main() {

    val myFunction = {
        val list = List(10000000) { (0..10000).random() }
        list.sorted()
    }

    val exec = timeTracker(myFunction)
    println("Функция выполнялась $exec миллисекунд")

}

fun timeTracker(fn: () -> Any): Long {

    val start = System.currentTimeMillis()
    fn()
    val end = System.currentTimeMillis()
    return end - start

}