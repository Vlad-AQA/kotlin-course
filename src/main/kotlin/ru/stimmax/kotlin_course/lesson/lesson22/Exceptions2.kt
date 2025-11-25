package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson22

class OrderException(message: String) : RuntimeException(message)

fun placeOrders(orderDetails: String) {
    if (orderDetails.isBlank()) {
        throw OrderException("Детали заказа не указаны.")
    }
    // Логика оформления заказа
    println("Заказ оформлен: $orderDetails")
}

fun main() {
    try {
        placeOrders("") // Попытка оформить заказ с пустыми деталями
    } catch (e: OrderException) {
        println("Ошибка при оформлении заказа: ${e.message}")
    }
}