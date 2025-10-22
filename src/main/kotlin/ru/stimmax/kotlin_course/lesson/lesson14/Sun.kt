package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson14

object  Sun {
    val isShining: Boolean = true
    val temperature: Int = 5500
    fun shine() {
        if (isShining) {
            println("The sun is shining with a temperature of $temperature°C.")
        } else {
            println("The sun is not shining right now.")
        }
    }
}