package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson9.homeworks

import org.jetbrains.annotations.Nullable
import ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson4.c

fun main() {

    ex1(arrayOf("123124134", "976875"), "123")
    exe2()

    //Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
    val ar1 = arrayOf(1, 2, 3, 4, 5)

    //Создайте пустой массив строк размером 10 элементов.
    val ar2: Array<String> = Array(10) {""}

    //Создайте массив из 5 элементов типа Double и заполните его значениями,
    // являющимися удвоенным индексом элемента.

    val ar3: Array<Double> = Array(5) {0.0}
    for (el in ar3.indices) {
        ar3[el] = (el * 2).toDouble()
    }


//Создайте массив из 5 элементов типа Int.
// Используйте цикл, чтобы присвоить каждому элементу значение,
// равное его индексу, умноженному на 3.

    val ar4: Array<Int> = Array(5) {0}
    for (el in ar4.indices) {
        ar4[el] = el * 3
    }

///Создайте массив из 3 nullable строк.
// Инициализируйте его одним null значением и двумя строками.

    val ar5 = arrayOfNulls<String>(3)
    ar5[0] = null
    ar5[1] = "1"
    ar5[2] = "2"

//Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    val ar6 = arrayOf(1, 2, 3, 4, 5)
    val ar7 = Array(5) {0}
    for (el in ar6.indices) {
        ar7[el] = ar6[el]
    }
    println(ar7)


//Создайте два массива целых чисел одинаковой длины.
// Создайте третий массив, вычев значения одного из другого.
// Распечатайте полученные значения.

    val ar8 = arrayOf(10, 20, 30, 40, 50)
    val ar9 = arrayOf(10, 10, 10, 10, 10)
    val ar10 = Array(5){0}
    for (el in ar8.indices) {
        ar10[el] = ar8[el] - ar9[el]
        println(ar10[el])
    }

//Создайте массив целых чисел.
// Найдите индекс элемента со значением 5.
// Если значения 5 нет в массиве, печатаем -1.
// Реши задачу через цикл while.

    val ar11 = arrayOf(10, 20, 30, 40, 50)
    var counter = 0
    var indexOf = -1
    while (counter < ar11.size) {
        if (ar11[counter] == 5){
            indexOf == counter
            break
        }
        counter++
    }
    println(indexOf)

//Создайте массив целых чисел.
// Используйте цикл для перебора массива и вывода каждого элемента в консоль.
// Напротив каждого элемента должно быть написано “чётное” или “нечётное”.

    val ar12 = arrayOf(10, 20, 30, 40, 50)
    for (el in ar12.indices) {
        if (ar12[el] % 2 == 0) {
            println("${ar12[el]} четное")
        } else {
            println("{$ar12[el]} нечетное")
        }
    }

}

//Создай функцию, которая принимает массив строк и строку для поиска.
// Функция должна находить в массиве элемент,
// в котором принятая строка является подстрокой (метод contains()).
// Распечатай найденный элемент.

fun ex1(array: Array<String>, arg: String) {
    for (el in array) {
        if (el.contains(arg)) {
            println(el)
        }
    }
}

// Работа со списками List
//Создайте пустой неизменяемый список целых чисел.
fun exe2() {
    val l1 = listOf<Int>()

//Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").

    val l2 = listOf("Hello", "World", "Kotlin")

// Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.

    val l3 = mutableListOf(1, 2, 3, 4, 5)
    l3.add(6)

//Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).

    l3.add(6)
    l3.add(7)
    l3.add(8)

// Имея изменяемый список строк, удалите из него определенный элемент (например, "World").

    val l4 = mutableListOf<String>("World", "1231214134")
    l4.remove("World")

//Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.

    val l5 = mutableListOf(1, 2, 3, 4, 5)
    for (el in l5) {
        println(el)
    }


//Создайте список строк и получите из него второй элемент, используя его индекс
    val l6 = listOf("Hello", "World", "Kotlin")
    println(l6[1])


//Имея изменяемый список чисел,
//измените значение элемента на определенной позиции
// (например, замените элемент с индексом 2 на новое значение).
    val l7 = mutableListOf(1, 2, 3, 4, 5)
    l7[2] = 6

//Создайте два списка строк и объедините их в один новый список,
// содержащий элементы обоих списков. Реши задачу с помощью циклов.
    val l8 = listOf("Hello", "World", "Kotlin")
    val l9 = listOf("12", "23", "34")
    val l10 = mutableListOf<String>()
    for (el in l8) {
        l10.add(el)
    }
    for (ell in l9) {
        l10.add(ell)
    }
    //Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
        val l11 = listOf(1, 2, 3, 4, 5)
        var minE = l11[0]
        var maxE = l11[0]
        for (el in l11) {
                if (el < minE)
                    minE = el
                if (el > maxE)
                    maxE = el
        }
        println(minE)
        println(maxE)

//Имея список целых чисел,
// создайте новый список,
// содержащий только четные числа из исходного списка используя цикл.

    val l12 = listOf(1, 2, 3, 4, 5)
    val l13 = mutableListOf<Int>()
    for (el in l12) {
        if (el % 2 == 0)
            l13.add(el)
    }
}