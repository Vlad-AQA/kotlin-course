package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson17

class Lamp() {

    private var isOn: Boolean = false

    fun ternOn() {
        isOn = true
    }

    fun ternOff() {
        isOn = false
    }

    fun shine(): Boolean {
        return isOn
    }
}