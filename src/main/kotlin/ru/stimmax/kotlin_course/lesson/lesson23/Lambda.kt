package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson23

// Обычное объявление функции
fun increment(a: Int): Int {
    return a + 1
}

// Анонимная функция, присвоенная переменной
val increment = fun(a: Int): Int {
    return a + 1
}

// Лямбда выражение с явно указанным типом
val increment1: (Int) -> Int = { a ->
    a + 1
}

// Лямбда выражение с использованием 'it' для однопараметрической лямбды
val increment2: (Int) -> Int = {
    it + 1
}

// Лямбда выражение без явного указания типа
val increment3 = { a: Int ->
    a + 1
}


// Это функция, которая ищет индекс первого вхождения подстроки в строку с учетом или без учета регистра.
fun findIndex(text: String, word: String, ignoreCase: Boolean = false): Int {
    return text.indexOf(word, 0, ignoreCase)
}

// теперь живи с этим, с лямбдой

val findIndex: (String, String, Boolean) -> Int = { text, word, ignoreCase ->
    text.indexOf(word, 0, ignoreCase)
}

// эталон лямбды(без явного указания типа)

val findIndex1 = { text: String, word: String, ignoreCase: Boolean ->
    text.indexOf(word, 0, ignoreCase)
}

class OrderProcessor(val deliveryAddress: String) {
    fun calculateDeliveryTime(productId: Int): String {
        val deliveryTimeDays = when (productId) {
            in 1..100 -> 3
            else -> 5
        }
        return "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
    }
}

// расширили класс методом выше

fun OrderProcessor.calculateDeliveryTime1(productId: Int): String {
    val deliveryTimeDays = when (productId) {
        in 1..100 -> 3
        else -> 5
    }
    return "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
}

// Преобразуем calculateDeliveryTime в анонимную функцию с контекстом OrderProcessor:

val calculateDeliveryTime = fun OrderProcessor.(productId: Int): String {
    val deliveryTimeDays = when (productId) {
        in 1..100 -> 3
        else -> 5
    }
    return "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
}

// теперь преобразуем анонимную функцию в лямбда выражение с контекстом:

val calculateDeliveryTime1: OrderProcessor.(Int) -> String = {
    val deliveryTimeDays = when (it) {
        in 1..100 -> 3
        else -> 5
    }
    "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
}

// Создай функцию, которая не принимает аргументов и печатает приветственное сообщение. Трансформируй
// в анонимную функцию
// в лямбда выражение с указанием типа
// в краткое лямбда выражение
fun greet() {
    println("Тут приветственное сообщение")
}

val greet1 = fun() {
    println("Тут приветственное сообщение")
}

val greet3: () -> Unit = { println("Тут приветственное сообщение") }

val greet2 = { println("Тут приветственное сообщение") }

// Создай функцию, которая принимает строку и возвращает его длину. Трансформируй
// в анонимную функцию
// в лямбда выражение с указанием типа
// в краткое лямбда выражение

fun getLength(arg: String): Int {
    return arg.length
}

val getLength1 = fun(a: String): Int {
    return a.length
}

val getLength2: (String) -> Int = { it.length }

val getLength3 = { it: String -> it.length }

// Создай функцию-расширение класса String, которая принимает число и символ и возвращает true
// если строка короче этого числа и содержит переданный символ. Трансформируй в анонимную функцию, потом в лямбду с типом

fun String.repeatChar(num: Int, char: Char): Boolean {
    return length < num && contains(char)
}

val repeatChar = fun String.(num: Int, char: Char): Boolean {
    return length < num && contains(char)
}

val repeatChar1: String.(Int, Char) -> Boolean = { n, c ->
    length < n && contains(c)

}

// Создай функцию-расширение дженерика, которая принимает дженерик и выводит его на печать.
// Попробуй трансформировать в анонимную функцию

fun <T> T.printArg1(a: T) {
    println(a)
}






























