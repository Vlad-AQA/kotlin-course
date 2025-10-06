package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson9

import ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson4.e

fun main() {

//Создание Массива:
//Используя arrayOf:
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    val doubles: DoubleArray = doubleArrayOf(1.1, 1.2, 1.3)

    val emptyArray = Array(5) { "" }

    val emptyNullableArray = arrayOfNulls<Int>(5)

// списки

    val readOnly: List<String> = listOf("1", "2", "3")

    val mutableList: MutableList<String> = mutableListOf("1", "2", "3")

    numbers[0] = 10

    mutableList.add("4")
    mutableList.removeAt(0)
    mutableList.remove("1")
    mutableList.add(1, "c")
    println(mutableList)
    mutableList[0] = "e"

// множества

    val numbersSet: Set<Int> = setOf(1, 2, 3, 4, 5)

    val mutableSetNumbers: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)

    val emptySet: Set<Int> = emptySet()
    val emptyMutableSet: Set<Int> = mutableSetOf()

    mutableSetNumbers.add(6)
    mutableSetNumbers.remove(1)

    // Перебор данных в списках

    val set = setOf("K", "o", "t", "l", "i", "n")
    for (letter in set) {
        println("| $letter |")
    }
    val list = listOf(32, 53, 1, -76)
    for (index in list.indices) {
        if (index == list.lastIndex) {
            println(list[index] + list[0])
        } else {
            println(list[index] + list[index + 1])
        }
    }
    var index = list.lastIndex
    while (index >= 0) {
        println("`${list[index--]}`")
    }

    val a1: Array<Int> = Array(10) { 0 }
    for (elements in a1.indices) {
        a1[elements] = (elements + 1) * 10

    }

    val a2: Array<Int> = Array(10) { 0 }
    for (i in a2.indices) {
        a2[i] = a1[i]
    }


    val l1: List<Int> = listOf(1, 2, 3)
    val a3 = arrayOf("", "")

    val ml = mutableListOf<Float>()
    ml.add(1.123F)
    ml.add(1.2F)

    for (i in ml) {
        println(i)
    }

    val l2 = listOf("dew", "qws")

    val st1 = setOf<Int>()

    val st2 = mutableSetOf("lakfj", "dqwds", "aqsdq")
    st2.add("qqwe")
    st2.remove("dqwds")

    val st3 = setOf(2, 3, 4)
    val st4 = setOf(3, 5, 7)
    val st5 = mutableSetOf<Int>()
    for (el in st3) {
        st5.add(el)
    }
    for (el in st4) {
        st5.add(el)
    }
    println(st5)

    val st6 = mutableSetOf<Int>()
    for (ell in st3) {
        for (el in st4) {
            if (ell == el) {
                st6.add(el) // любой el или ell
            }
        }
    }
}

fun ex(list: List<String>) {
    val str = "dew"
    for(el in list) {
        if (el == str) {
            println("true")
            return
        }
       println("false")
    }
}















