package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson14.homeworks

data class Product(val name: String, val price: Double, val quantity: Int) {
    fun prices(): Double{
        return price
    }
}
