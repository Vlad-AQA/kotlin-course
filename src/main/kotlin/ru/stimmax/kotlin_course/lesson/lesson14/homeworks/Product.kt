package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson14.homeworks

class Product(val name: String, var price: Double, var quantity: Int) {
    fun printProduct() {
        println("Продукт: $name, цена: $price, остаток: $quantity ")
    }
}