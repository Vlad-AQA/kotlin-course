package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson24.homeworks

// Создай функцию, которая:
// принимает булево значение
// принимает функцию, принимающую строку и ничего не возвращающую
// возвращает целое число

fun ex1(arg: Boolean, fn: (String) -> Unit): Int {
    return 0
}

// Создай функцию расширения целого числа, которая:
// принимает функцию расширения целого числа, принимающую строку и возвращающую список строк
// возвращает список строк

fun Int.fn(fn: (String) -> List<String>): List<String> {
    return listOf<String>()
}

// Создай функцию с двумя дженериками расширяющую первый дженерик, которая:
// принимает функцию расширяющую первый дженерик, ничего не принимает и возвращает второй дженерик
// возвращает второй дженерик

fun <A, B> A.fn1(fn1: A.() -> B): B {
    return this.fn1()
}

// Создай функцию, которая:
// принимает строку
// возвращает функцию, которая ничего не принимает и возвращает строку

fun ex2(arg: String): () -> String {
    return { arg }
}

// Создай функцию расширяющую дженерик, которая:
// ничего не принимает
// возвращает функцию, принимающую строку и возвращающую дженерик

fun <T> T.ex3(): (String) -> T {
    return { this }
}

//Напиши функцию colorizeWords которая печатает слова из длинного предложения
//разбитого по пробелу разным цветом. Правило подбора цвета для каждого слова
//нужно передавать в виде функции, которая принимает слово и возвращает это же
//слово но уже "в цвете" через функцию colorize.
//Функция colorizeWords должна расширять строку и эту же строку и обрабатывать.

object Colors {
    const val RESET = "\u001B[0m"
    const val RED = "\u001B[31m"
    const val GREEN = "\u001B[32m"
    const val YELLOW = "\u001B[33m"
    const val BLUE = "\u001B[34m"
    const val PURPLE = "\u001B[35m"
    const val CYAN = "\u001B[36m"
    const val WHITE = "\u001B[37m"
}

fun String.colorize(color: String): String {
    return "$color$this${Colors.RESET}"
}

fun String.colorizeWords(fn: (String) -> String): String {
    return ""
}

















