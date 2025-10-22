package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson14


class Car(val brand: String, val model: String) {
        companion object {
            val popularBrands = listOf("Toyota", "BMW", "Tesla", "Ford")
        }

        fun showInfo() {
            println("Car brand: $brand, model: $model")
        }
    }
