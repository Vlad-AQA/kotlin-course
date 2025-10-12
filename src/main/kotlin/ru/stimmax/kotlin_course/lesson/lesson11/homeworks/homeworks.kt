package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson11.homeworks

import org.jetbrains.annotations.Nullable

fun main() {

}

// Не принимает аргументов и не возвращает значения.
fun ex1() {

}

// Принимает два целых числа и возвращает их сумму.
fun ex2(a: Int, b: Int): Int = a + b

// Принимает строку и ничего не возвращает.
fun ex3(str: String) {

}

// Принимает список целых чисел и возвращает среднее значение типа Double.
fun ex4(list: List<Int>): Double {
    var counter = 0
    var counter1 = 0
    for (el in list) {
        counter += el
        counter1++
    }
    return counter.toDouble() / counter1.toDouble()
}

// Принимает nullable строку и возвращает её длину
// в виде nullable целого числа и доступна только в текущем файле.
private fun ex5(str: String?): Int?{
    return str?.length
}

// Не принимает аргументов и возвращает nullable вещественное число.
fun ex6(): Float?{
    return  null
}

// Принимает nullable список целых чисел,
// не возвращает значения и доступна только в текущем файле.
private  fun ex7(list: List<Int?>) {

}

// Принимает целое число и возвращает nullable строку.
fun ex8(a: Int): String? {
    return null
}

// Не принимает аргументов и возвращает список nullable строк.
fun ex9(): List<String?>? {
    return null
}

// Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
fun ex10(str: String?, int: Int?): Boolean? {
    return null
}

// Напишите функцию multiplyByTwo,
// которая принимает целое число и возвращает его, умноженное на 2.

fun multiplyByTwo(int: Int): Int = int * 2

// Создайте функцию isEven,
// которая принимает целое число и возвращает true,
// если число чётное, и false в противном случае.

fun isEven(number: Int): Boolean = number % 2 == 0


// Напишите функцию printNumbersUntil,
// которая принимает целое число n
// и выводит на экран числа от 1 до n.
// Если число n меньше 1,
// функция должна прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil(n: Int) {
    if ( n < 1) return
    for (i in 1..n) {
        println(i)
    }
}

// Создайте функцию findFirstNegative,
// которая принимает список целых чисел
// и возвращает первое отрицательное число в списке.
// Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(list: List<Int>): Int? {
    for (el in list) {
        if (el < 0)
            return el
    }
    return  null
}

// Напишите функцию processList,
// которая принимает список строк.
// Функция должна проходить по списку и выводить каждую строку.
// Если встречается null значение,
// функция должна прекратить выполнение с помощью return без возврата значения.
fun processList(list: List<String?>): Unit {
    for (el in list) {
        if (el == null) return
        println(el)
    }
}