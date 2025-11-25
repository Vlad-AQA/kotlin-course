package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson22

fun main() {
    /* throw Exception("Ошибка")
     throw Error("")
     OutOfMemoryError() // переполнена память, утечка памяти.
     StackOverflowError() // переполнен стек вызова функций
     Exception()
     IOException()
     RuntimeException() */

    try {
        arrayOf("1")[2]
    } catch (e: IndexOutOfBoundsException) {
        println(e.message)
    } catch (e: Exception) {
        println(e)
    } finally {
        // Блок, который выполняется всегда, независимо от наличия исключения
        println("Всегда выполняется")
    }

    try {
        // Код, который может выбросить исключения
    } catch (e: Exception) {
        when (e) {
            is IndexOutOfBoundsException, is NullPointerException -> {
                println("Обработано исключение типа IndexOutOfBoundsException")
            }

            is RuntimeException -> {
                println("Обработано исключение типа RuntimeException")
            }

            else -> throw e // Перебрасываем исключение дальше, если оно не соответствует обработанным типам
        }
    }

}

fun placeOrder(orderDetails: String) {
    if (orderDetails.isBlank()) {
        throw OrderException("Детали заказа не указаны.")
    }
    // Логика оформления заказа
    println("Заказ оформлен: $orderDetails")
}

class CustomException : RuntimeException {
    constructor(message: String) : super(message)
    constructor(message: String, cause: Throwable) : super(message, cause)
    constructor(cause: Throwable) : super(cause)
}


