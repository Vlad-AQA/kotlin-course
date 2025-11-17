package ru.stimmax.ru.stimmax.kotlin_course.lesson.extensions

fun String.removeSpaces(): String {
    return this.replace(" ", "")
}