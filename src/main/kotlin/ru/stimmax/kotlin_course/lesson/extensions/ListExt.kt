package ru.stimmax.ru.stimmax.kotlin_course.lesson.extensions

fun <T> List<T?>.isElementsNullOrEmpty(): Boolean {
    return this.all { it == null } || this.isEmpty()
}