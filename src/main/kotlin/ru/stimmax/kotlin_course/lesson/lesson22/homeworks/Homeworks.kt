package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson22.homeworks

fun main() {


// NullPointerException

    try {
        val a = null
        a!!
    } catch (e: NullPointerException) {
        println(e.message)
    }
//
//// IndexOutOfBoundsException
    try {
        val b = listOf("1", "2")
        b[3]
    } catch (e: IndexOutOfBoundsException) {
        println(e.message)
    }

// ClassCastException
    try {
        val cic = "слова"
        cic as Number
    } catch (e: ClassCastException) {
        println(e.message)
    }


// IllegalArgumentException
    try {
        Array<Int>(-1) { 0 }
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }


// NumberFormatException
    try {
        val str = "a"
        str.toInt()
    } catch (e: NumberFormatException) {
        println(e.message)
    }

// IllegalStateException
    try {
        val nul = null
        checkNotNull(nul)
    } catch (e: IllegalStateException) {
        println(e.message)
    }


// OutOfMemoryError
    try {
        val list = mutableListOf<Number>()
        while (true) {
            list.add(1000 * 1000.00F)
        }
    } catch (e: OutOfMemoryError) {
        println(e.message)
    }


// StackOverflowError
    try {
        exe1()
    } catch (e: StackOverflowError) {
        println(e.message)
    }

}

fun exe1() {
    exe1()
}

// Напиши функцию, которая принимает nullable аргумент типа Any и в блоке try/catch выполни набор действий
// с этим аргументом которые могут потенциально вызвать одно из исключений в этом же порядке:
// NullPointerException
// IndexOutOfBoundsException
// ClassCastException
// IllegalArgumentException не смог
// NumberFormatException
// IllegalStateException не смог
// В блоке catch перехватывай исключение с общим типом Throwable а внутри
// через when определи тип исключения и выведи сообщение с названием исключения.
// Сразу после when выброси перехваченное исключение через throw,
// чтобы прекратить работу программы.
// Если аргумент функции не вызвал исключение, то выведи текст,
// сообщающий что переданный аргумент фантастически хорош!

fun exe2(arg: Any?) {
    try {
        arg!!
        val a = arg as List<*>
        a[3]
        val q = a[0] as String
        q.toInt()

    } catch (e: Throwable) {
        when (e) {
            is NullPointerException -> println("Исключение NullPointerException")
            is IndexOutOfBoundsException -> println("Исключение IndexOutOfBoundsException")
            is ClassCastException -> println("Исключение ClassCastException")
            is IllegalArgumentException -> println("Исключение IllegalArgumentExceptionс")
            is NumberFormatException -> println("Исключение NumberFormatException")
            is IllegalStateException -> println("Исключение IllegalStateException")
            else -> println("Неизвестное исключение")
        }
        throw e
    }
    println("Переданный аргумент фантастически хорош!")
}
