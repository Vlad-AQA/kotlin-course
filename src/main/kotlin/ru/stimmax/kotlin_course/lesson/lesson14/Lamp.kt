package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson14

class Lamp(var isOn: Boolean) {
    fun toggle() {
        isOn = !isOn
        val state = if (isOn) "on" else "off"
        println("The lamp is $state")
    }
}