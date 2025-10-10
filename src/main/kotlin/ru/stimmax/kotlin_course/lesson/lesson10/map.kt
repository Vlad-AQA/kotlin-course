package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson10

import ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson8.homeworks.exe1
import ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson9.homeworks.ex1

fun main() {

    val pair = 1 to "a"
    val capitals = mapOf<String, String>("h" to "m", "q" to "n")
    val emptyMap = mapOf<String, Int>()
    val mutableMap = mutableMapOf<Int, Int>(1 to 2, 4 to 45)

    mutableMap[1] = 3

    for ((contry, capital) in capitals) {
        println("$contry: $capital")
    }


    if ("h" in capitals) {
        println("aga ${capitals["aga"]}")
    }

    val a = mutableMapOf<String?, Int>(null to 1)

    val a1 = mutableMapOf("a" to 1, "b" to 1)

    val a2 = mapOf<String, Int>()
    val a3 = mapOf("1" to 1, "2" to 2)
    val a4 = mutableMapOf("1" to "2")
    a4["2"] = "2"
    a4.remove("1")
    for ((el, ell) in a4) {
        println("$el, $ell")
    }

    a4["2"] = "2"

    if ("1" in a4)
        println(a4["1"])
    else {
        println("нет ключа 1")
    }

    a4["1"] = "3"
    val a5 = mapOf<String, MutableList<String>>()
    val a6 = mapOf<String, MutableMap<String, String>>()
    val a7 = mutableMapOf<String, MutableMap<String, String>>()
    a7["Пупок"] = mutableMapOf("телефон" to "8888888888")
    a7["Пупок"]?.put("район", "МО")

    fun ex1(map: Map<String, String>, str: String) {
        for ((k, v) in map) {
            if (str == k) {
                println(v)
                return
            }
        }
        println("Ключа нет")
    }
}











