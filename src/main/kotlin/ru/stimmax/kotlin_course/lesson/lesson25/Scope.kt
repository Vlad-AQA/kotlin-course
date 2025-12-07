package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson25


fun main() {

// with
// Функция `with` принимает объект и лямбду. Внутри лямбды объект доступен через
// `this`. Часто используется для группировки операций, которые должны быть выполнены над объектом.
    val list = mutableListOf(1, 2, 3)
    println(list.size)
    list.add(3)
    println(list.size)
// То же используя with
    with(list) {
        println(size)
        add(4)
        println(size)
    }


//    run
//    Функция `run` аналогична `with`, но вызывается на самом объекте.
//    Полезна, когда нужно выполнить блок кода и вернуть результат.

    list.add(5)
    list.sum()

    // То же используя run
    list.run {
        add(5)
        sum()
    }


//    use
//    Функция `use` предназначена для работы с ресурсами,
//    которые нужно закрыть после использования, например, с потоками ввода/вывода.

//    val s = File("example.txt").inputStream()
//    val content = s.readBytes()
//    println(content)
//    s.close()
// То же используя use
//    File("example.txt").inputStream().use {
//        val content = it.readBytes()
//        println(content.size)
//    }


//    apply
//    Функция `apply` возвращает объект после выполнения блока кода. Удобна для инициализации объектов.

    mutableListOf<Int>()
    list.add(1)
    list.add(2)
// То же используя apply
    mutableListOf<Int>().apply {
        add(1)
        add(2)
    }

//    also
//    Функция `also` аналогична `apply`, но внутри лямбды объект доступен через `it`.
//    Полезна для выполнения дополнительных операций, не влияющих на объект.

    list.also {
        println("Добавляем 3")
    }.add(3)

//
//    let
//    Функция `let` позволяет выполнить блок кода и вернуть результат.
//    Внутри лямбды объект доступен через `it`. Часто используется для обработки nullable-объектов.

    val str: String = "Hello"
    str?.let {
        println(it.length)  // Выполняется только если str не null
    }
}

fun ex(): Int {
    val arg1 = listOf(1, 2, 3)
    val a = arg1.sum()
    println(a)
    return a
}

fun ex1(): Int {
    return listOf(1, 2, 3).sum()
        .apply { println(this) }
}

fun ex2(): Int {
    return listOf(1, 2, 3).sum()
        .also { println(it) }
}

fun ex3(): Int {
    val num = mutableListOf(1, 2, 3)
    num.add(4)
    num.add(5)
    println(num.size)
    return num.sum()
}

fun ex4(): Int {
    return with(mutableListOf(1, 2, 3)) {
        add(4)
        add(5)
        println(this)
        sum()
    }
}


fun ex5(): Int {
    return mutableListOf(1, 2, 3).run {
        add(4)
        add(5)
        println(this)
        sum()
    }
}

fun ex6(list: List<String?>): Int {
    val a = list.sumOf { it?.length ?: 0 }
    println(a)
    return a
}

fun ex7(list: List<String>?): Int {
    return (list?.let { itt ->
        itt.sumOf { it.length }
    } ?: 0).also { println(it) }
}





















