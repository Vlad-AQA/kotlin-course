package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson11

fun main() {
  //  Синтаксис функции:

   // fun имяФункции(параметры): ТипВозвращаемогоЗначения {
        // Тело функции
       // return значение
    }


//Пример функции без параметров и возвращаемого значения:

fun sayHello() {
    println("Hello, world!")
}

//Пример функции с параметрами:

fun greetUser(name: String) {
    println("Hello, $name!")
}

//Пример функции, возвращающей значение:

fun sum(a: Int, b: Int): Int {
    return a + b
}
//Если функция ничего не возвращает, то тип возвращаемого значения — Unit.
// Обычно его можно опустить, как в примерах выше. Это аналогично void
// в других языках программирования.

fun printSum(a: Int, b: Int) {
    println("Sum of $a and $b is ${a + b}")
}

//Kotlin позволяет определять функции одной строкой
// без использования фигурных скобок {} и оператора return, если функция проста.

fun multiply(a: Int, b: Int): Int = a * b

// Public — функция доступна отовсюду. По умолчанию, все функции являются публичными, если явно не указано другое.

// private — функция доступна только внутри того файла или класса, в котором она определена.

// Пример:

private fun calculateDiscount(price: Double): Double {
    return price * 0.1
}
fun finalPrice(price: Double): Double {
    val discount = calculateDiscount(price)
    return price - discount
}

// Пример использования return:

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

//Пример функции с использованием return для немедленного завершения:

fun findValue(numbers: List<Int>, target: Int) {
    for (number in numbers) {
        if (number == target) {
            println("Value found: $number")
            return
        }
    }
    println("Value not found")
}