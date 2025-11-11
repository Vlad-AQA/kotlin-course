package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson19

import ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson11.max

class BoxAny<T>(val item: T)

fun main() {
    val appleBoxAny = BoxAny("Apple")
    val intBoxAny = BoxAny(42)

    appleBoxAny.item // Any вместо строки
    intBoxAny.item // Any вместо числа

    secondOrNull(listOf("a", "b", "c"))?.length

    fun main() {
        println(sum(5, 10))        // 15.0
        println(sum(3.5, 2.5))     // 6.0
    }
}

fun <S> secondOrNull(list: List<S>): S? {
    return list.getOrNull(1)
}

fun <T : Number> sum(a: T, b: T): Double {
    return a.toDouble() + b.toDouble()
}

class GenericIterator<T : Number, R : Iterable<T>>(
    private val argument: T,
    private val elements: R
) {

    fun printElements() {
        for (e in elements) {
            println(
                e.toString()
                    .repeat(argument.toInt())
            )
        }
    }
}

class Conteiner<A>(
    private val arg: A
) {
    fun getArg(): A {
        return arg
    }
}

class PairBox<K, V>(
    val arg: K,
    val arg1: V
) {
    fun getMap(): Map<K, V> {
        return mapOf(arg to arg1)
    }

}

class Multiplier<N : Number>() {
    fun x(arg: N): Double {
        return arg.toDouble() * 2
    }
}

interface Storage<A> {
    fun save(arg: A)
    fun get(): A
}

interface Transformer<A, B> {
    fun transformer(arg: A): B
}

interface PairProcessor<A, B> {
    fun ab(arg: A, arg1: B)
}

interface ConectionDiff<A, B, C> {
    fun connect(arg: List<A>, arg1: List<B>): List<C>
}

fun <A> swap(a: MutableList<A>, index1: Int, index2: Int): List<A> {
    if (index1 in a.indices && index2 in a.indices) {
        val t = a[index1]
        a[index2] = a[index1]
        a[index1] = t
    }
    return a.toList()
}


fun <N : Number> mergeList(a: List<N>, b: List<N>): List<Double> {
    val s = mutableListOf<Double>()
    val m = max(a.lastIndex, b.lastIndex)
    for (i in 0..m) {
        val ss = a.getOrElse(i) { 0 }.toDouble() + b.getOrElse(i) { 0 }.toDouble()
        s.add(ss)
    }
    return s.toList()
}











