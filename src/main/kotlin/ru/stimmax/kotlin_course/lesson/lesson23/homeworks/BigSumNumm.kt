package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson23.homeworks

fun main() {
    // Создай аналогичную анонимную функцию.

    fun(bNum: Long): Int {
        require(bNum > 0) {
            "Число не может быть отрицательным"
        }
        return bNum
            .toString()
            .sumOf { it.digitToInt() }
    }

//// Создай аналогичное лямбда выражение с указанием типа.

    val bigSumNum3: (Long) -> Int = { bNum ->
        require(bNum > 0) {
            "Число не может быть отрицательным"
        }
        bNum.toString()
            .sumOf { it.digitToInt() }
    }

// Создай лямбда выражение без указания типа.

    val bigSumNum4 = { bNum: Long ->
        require(bNum > 0) {
            "Число не может быть отрицательным"
        }
        bNum.toString()
            .sumOf { it.digitToInt() }


    }

    println(bigSumNum4(123L))
// println(bigSumNum3(-123L)) //  выкинет исключение с нашим текстом

}

//// Создай функцию, которая принимает большое число и возвращает сумму цифр этого числа.
//// Сделай проверку, что входящее число больше нуля.
//// Подсказка: для парсинга символа в число можно использовать функцию digitToInt()

fun bigSumNum1(bNum: Long): Int {
    require(bNum > 0) {
        "Число не может быть отрицательным"
    }
    return bNum
        .toString()
        .sumOf { it.digitToInt() }
}


// это мое решение, но оно слишком сложное
fun bigSumNum(bNum: String): Int {
    require(bNum.toInt() > 0) {
        "Число не может быть отрицательным"
    }
    return bNum.split("")
        .filter { it.isNotEmpty() }
        .map { it.toInt() }
        .sumOf { it }
}
