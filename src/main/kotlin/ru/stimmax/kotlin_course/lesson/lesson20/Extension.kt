package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson20

import ru.stimmax.ru.stimmax.kotlin_course.lesson.extensions.isElementsNullOrEmpty
import ru.stimmax.ru.stimmax.kotlin_course.lesson.extensions.removeSpaces

fun removeSpaces(str: String): String {
    return str.replace(" ", "")
}

val result = removeSpaces("String with spaces")


val result1 = "Hello, World!".removeSpaces() // "Hello,World!"


val list: List<Int?> = listOf(null, 1)
val isEmpty = list.isElementsNullOrEmpty() // true

fun String.fun1(num: Int, num1: Int): Boolean {
    return true
}

fun List<Int>.fun2(str: String?) {

}

fun <A, B> Map<A, B>.fun3(k: A, v: B): B {
    return v
}

fun Double?.fun4(): Int? {
    return null
}

fun <A> Set<A>.fun5(arg: A): List<A> {
    return this.toList()
}

fun Double.fun6(): String {
    return "%,.2f".format(this)
}

fun String.fun7(): Int {
    return split(" ").count { it.isNotBlank() }
}

fun <A> A.fun8(): List<A> {
    return listOf(this)
}

fun Any.fun9() = listOf(this)

fun main() {

    println(12.123123.fun6())
    "".fun8()
}