package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson7

import ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson4.c

fun main() {

    val length = 50

    for (i in 1..10) {
        println(i)
    }

    //  for (i in 10 downto 1)

    for (i in 1..10 step 2) {
        println(i)
    }

    // for (i in 1 <= until <= 10)

    val range = 1..10
    for (i in range) {
        println(i)
    }

    var counter = 1
    while (counter++ < 10) {
        println(counter)
    }
    do {
        println(counter)
    } while (counter++ < 10)


    for (i in 1..10) {
        if (i == 3) break
        println(i)
    }

    for (i in 1..10) {
        if (i == 3) continue
        println(i)
    }

    for (i in 1 until length) {
        println(i)
    }

    var sum = 0
    while (counter <= 10) {
        sum+=counter
        counter++
    }
    do {
        counter++
        sum+=counter
        println(sum)
    } while ((sum + counter) >= 50)

    while (true) {
        if (counter++ % 7 == 0) break
        println(counter)
    }

    for (i in 1..10) {
        if (i == 3 || i == 7) continue
        println(i)
    }


    for (i in 20 downTo 1) {
        counter++
        if (counter == 4) {
            counter == 0
            continue
        }
        println(i)
    }





}
