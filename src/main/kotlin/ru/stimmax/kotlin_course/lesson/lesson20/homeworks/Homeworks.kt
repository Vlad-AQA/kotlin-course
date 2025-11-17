package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson20.homeworks

import kotlin.math.absoluteValue

// Определите функцию-расширение для массива чисел,
// которая не принимает аргументов и возвращает пару из чисел - первое и последнее.
// Если массив был пуст то вернуть пару из null значений.

fun Array<Int?>.fun10(): Pair<Int?, Int?> {
    return if (isEmpty())
        null to null
    else
        first() to last()
}

// Создайте функцию-расширение для изменяемого списка элементов:
// с дженериком T ограниченным интерфейсом Comparable<T>
// которая принимает булево значение
// возвращает этот же список только в виде неизменяемого
// сам изменяемый список при этом должен стать отсортированным по возрастанию
// если в функцию передано true и по убыванию, если false (используем функции sort() и sortDescending()

fun <T : Comparable<T>> MutableList<T>.fun11(arg: Boolean): List<T> {
    if (arg) {
        this.sort()
    } else {
        this.sortDescending()
    }
    return this
}

// Создайте функцию-расширение для nullable словаря с дженериком:
// Ключ является дженериком
// Значение является списком из дженериков
// Принимает целое число
// Возвращает nullable словарь из ключей изначального словаря приведённых к строке через toString()
// Значений из nullable дженерика, взятых из изначального ключа-списка по индексу из аргумента,
// если такого индекса нет - значением будет null

fun <T> Map<T?, List<T?>>?.fun22(arg: Int): Map<String?, T?>? {
    return this?.asIterable()?.associate {
        it.key?.toString() to it.value.getOrNull(arg)

    }
}

// Реализуйте метод расширения within для класса Number,
// который проверяет, что текущее число отклоняется от эталонного не более допустимого значения.
// Метод принимает два параметра: other — число для сравнения
// и deviation — максимально допустимое отклонение.
// Метод должен возвращать true, если разница между текущим числом и числом для сравнения не превышает заданное отклонение.
// Протестируйте функцию на разных типах чисел.
// Для получения отклонения, у разницы чисел нужно вызвать свойство absoluteValue.

fun <T : Number> Number.within(other: T, deviation: T): Boolean {
    return ((this.toDouble() - other.toDouble()).absoluteValue <= deviation.toDouble())
}

// Реализуйте для класса String два метода расширения: encrypt и decrypt.
// Метод encrypt должен сдвигать каждый символ исходной строки на заданное число позиций вперед по таблице Unicode,
// а метод decrypt — на то же число позиций назад.
// Оба метода принимают один параметр base типа Int, который определяет величину сдвига.
// Протестируйте вашу реализацию, убедившись, что после шифрования и последующей расшифровки
// строка возвращается к исходному состоянию.

fun String.encrypt(base: Int): String {
    return this.map { it + base }.joinToString("")
}

fun String.decrypt(base: Int): String {
    return this.map { it - base }.joinToString("")
}

fun main() {

    val a = "Это проверочка очка".encrypt(4)
    println(a)
    val b = a.decrypt(4)
    println(b)
}
