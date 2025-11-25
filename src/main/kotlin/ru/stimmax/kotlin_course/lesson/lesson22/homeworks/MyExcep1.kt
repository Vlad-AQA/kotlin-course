package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson22.homeworks

// Создай свой тип исключения в отдельном файле,
// наследуемый от RuntimeException и принимающий IndexOutOfBoundsException
// тип в качестве аргумента. Напиши код, который спровоцирует выброс IndexOutOfBoundsException,
// перехвати его с помощью try-catch и в блоке catch выведи сообщение в консоль и сделай выброс своего типа исключения.


class MyExcep1(cause: IndexOutOfBoundsException) : RuntimeException(cause)

fun listIndexOff(list: List<String>, index: Int) {
    list[index]
}

fun main() {
    try {
        listIndexOff(listOf("", "2"), 3)
    } catch (e: IndexOutOfBoundsException) { // тут всегда именно то исключение которое мы ждем в тру
        println("Вышли за рамки списка")
        throw MyExcep1(e)
    }

}