package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson6

fun main() {
    example1(arg= 5)
    ex2(arg1 = 10,false)
}




fun example1 (arg: Int) {
    when (arg) {
        in 0..5 -> println("night")
        in 6..11 -> println("morning")
        in 12..17 -> println("afternoon")
        in 18..23 -> println("evening")
        else -> println("time is incorrect")

    }
}

fun ex2 (arg1: Int, arg2: Boolean) {
    if (arg1 > 30 || arg1 < -15) {
        if (arg2) println("stay a home")
        else println("take a car")
    } else if (arg1 >= 10 && !arg2){
        println("walk")
    } else {
        println("buss")
    }
}