package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson24

fun ex1(fn: () -> Unit) {

}

fun ex2(fn: (Int) -> String) {}

fun ex3(fn: Int.() -> Unit) {}

fun ex4(fn: (Double, Double) -> Boolean) {}

fun <T> ex5(fn: (T) -> List<T?>) {}

fun ex6(arg: String): (Int) -> Boolean {
    return { true }
}

fun Number.encode(fn: (Char) -> Char): String {
    return toString().map(fn).joinToString { "" }
}

fun <T : Number> String.decode(fn: (Char) -> Char, fn2: (String) -> T): T {
    return fn2(map(fn).joinToString { "" })


}

fun main() {

    val a = 10.02.encode { it + 5 }
    a.decode({ it - 5 }, { it.toDouble() })

}