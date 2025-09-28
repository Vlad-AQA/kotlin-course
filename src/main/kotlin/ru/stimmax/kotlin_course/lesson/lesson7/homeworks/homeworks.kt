package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson7.homeworks

import ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson4.c

fun main() {

    //Прямой диапазон
    //Напишите цикл for, который выводит числа от 1 до 5.
    //Напишите цикл for, который выводит четные числа от 1 до 10.
    for (i in 1..5) {
        println(i)
    }
    for (i in 1..10) {
        if ( i % 2 == 0){
            println(i)
        }
    }
    //Обратный диапазон
    //Создайте цикл for, который выводит числа от 5 до 1.
    //Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
    for (i in 5 downTo 1) {
        println(i)
    }
    for (i in 10 downTo 1 step 2) {
        println(i - 2)
    }
    //С шагом (step)
    //Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
    //Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20
    for (i in 1..9 step 2) {
        println(i)
    }
    for (i in 1..20 step 3) {
        println(i)
    }
    //Использование до (until)
    //Создайте числовую переменную 'size'.
    // Используйте цикл for с шагом 2 для вывода чисел от 3 до size не включая size.
    val size = 10
    for (i in 3 until size step 2) {
        println(i)
    }
    //Цикл while
    //Создайте цикл while, который выводит квадраты чисел от 1 до 5.
    //Напишите цикл while, который уменьшает число от 10 до 5.
    // После этого вывести результат в консоль
    var counter = 1
    while (counter < 6) {
        println(counter * counter)
        counter++
    }
    var counter1 = 10
    while (counter1 > 4) {
        println(counter1--)
    }
    //Цикл do while
    //Используйте цикл do while, чтобы вывести числа от 5 до 1.
    //Создайте цикл do while, который повторяется, пока счетчик меньше 10, начиная с 5.
    var counter2 = 5
    do {
        println(counter2)
        counter2--
    } while (counter2 > 0)

    var counter3 = 5
    do {
        println(counter3)
        counter3++
    } while (counter3 < 10)

    //Использование break
    //Напишите цикл for от 1 до 10 и используйте break,
    // чтобы выйти из цикла при достижении 6.
    //Создайте цикл while, который бесконечно выводит числа,
    // начиная с 1, но прерывается при достижении 10.

    for (i in 1..10) {
        if (i == 6) break
        println(i)
    }

    var counter4 = 1
    while (true) {
        println(counter4)
        counter4++
        if (counter4 == 10) break
    }

    //Использование continue
    //В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
    //Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.

    for (i in 1..10) {
        if (i % 2 == 0) continue
        println(i)
    }
    var counter5 = 0

    while (counter5 < 11) {
        counter5++
        if (counter5 % 3 == 0) continue
        println(counter5)

    }

    // Используя вложенный цикл реализовать таблицу умножения, как на картинке.

    for (i in  1..10) {
        for (j in  1..10) {
            print("${i * j}\t")
        }
        println()
    }




}