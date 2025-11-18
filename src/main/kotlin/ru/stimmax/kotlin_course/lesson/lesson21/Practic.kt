package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson21

fun main() {
    "123"
    // println((arg as String).length)
    // println(arg.length as Int)

    //  if (arg is String) {
    //     println(arg)
    // } else {
    //     println("это не строка")
    //  }


    // println(arg as? String ?: "не строка это")

    val b: Any = listOf("строка")
    // println(b as List<String>)
    // println((b as List<Int>)[0].absoluteValue)

    //  if (b is List<*>) {
    //    println(b)
    // }

    // if((b as List<*>).isNotEmpty() && b[0] is String) {
    //      println(b[0])
    //  }

    println((b as? List<*>)?.getOrNull(0) as? String ?: "не строка")


}

fun tryMultiple(arg: Any): Int? {
    return if (arg is Int) {
        arg * 2
    } else if (arg is String) {
        return arg.toInt() * 2
    } else {
        return null
    }
}

fun ex1(arg: Any): Int? {
    return (arg as? Int)?.times(2) ?: (arg as? String)?.toIntOrNull()?.times(2)
}

