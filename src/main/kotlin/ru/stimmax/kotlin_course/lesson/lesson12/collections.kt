package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson12

fun main() {

    val  numbers = listOf(-1, 2, -3, 4, -5, 8, 264)

    val positive = mutableListOf<Int>()

    numbers.forEach {
        val isPositive = it > 0
        if (isPositive) {
            positive.add(it)
        }
    }


    val list = listOf(8, 56, 23, 87, 12, 18, 11)
    val filtered1 = filter(list)
    println(filtered1)

    val filtered2 = list.filter {
        it in 7..17
    }
    println(filtered2)

    val positiveNumbers = numbers.filter { it > 0 }
    println(positiveNumbers)

    val positiveFiltered = numbers.filter { it > 0 }


    val notPositiveNumbers = numbers.filterNot { it > 0 }

    val nullableList = listOf(1, null, 2, null, 3)
    val nonNullList = nullableList.filterNotNull()
    println(nonNullList) // Вывод: [1, 2, 3]

    list[list.lastIndex]

    list.first{ it > 0}

    list.last{ it > 0}



    val setOfNumbers = setOf(3, 4, 5, -5, 14)
    val firstElement = setOfNumbers.first()
    val lastElement = setOfNumbers.last()
    println(firstElement)
    println(lastElement)

    val firstPositive = numbers.firstOrNull { it > 0 }
    println(firstPositive) // Вывод: 2
    val nullable = numbers.firstOrNull { it > 1000 }
    println(nullable) // Вывод: null
    val elementOrElse = numbers.getOrElse(10) { -1 }
    println(elementOrElse) // Вывод: -1


    val incrementedNumbers = numbers.map { it + 1 }
    println(incrementedNumbers) // Вывод: [0, 3, -2, 5, -4]

    val numberSquareMap:  Map<Int, Int> = numbers.associate { it to it * it }
    println(numberSquareMap) // Вывод: {-1=1, 2=4, -3=9, 4=16, -5=25}

    //склейка
    val multipleList = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6)
    )
    val flattenList = multipleList.flatten()
    println(flattenList)

    //Выполняет одновременно преобразование вложенных коллекций
    // и склеивание в одну общую коллекцию.

    val flattenListAfterMapping = multipleList.flatMap {list ->
        list.map { it * 2 }
    }
    println(flattenListAfterMapping)


   // Пример: Преобразовать список чисел в строку, разделенную запятыми.

    val numbersString = numbers.joinToString(separator = " , ") {"${it * 2}"}
    println("numbersString = $numbersString") // Вывод: "-1, 2, -3, 4, -5"

   // сортирует элементы коллекции в возрастающем порядке.

    val sortedNumbers = numbers.sorted()
    println(sortedNumbers) // Вывод: [-5, -3, -1, 2, 4]

    //сортирует элементы в убывающем порядке.

    val sortedDescendingNumbers = numbers.sortedDescending()
    println(sortedDescendingNumbers) // Вывод: [4, 2, -1, -3, -5]

    //size возвращает длину коллекции.
    println(numbers.size)

    //Проверяет, является ли коллекция пустой

    if (numbers.isEmpty()) {
        println("Коллекция пуста")
    } else {
        println("В коллекции ${numbers.size} значений")
    }


    //Проверяет, что коллекция содержит нужный элемент.

    if (numbers.contains(42)) {
        println("Коллекция содержит ответ на главный вопрос")
    } else {
        println("В коллекции нет ответа на главный вопрос")
    }

   // Так же можно использовать оператор in.

    if (42 in numbers) {
        println("Коллекция содержит ответ на главный вопрос")
    } else {
        println("В коллекции нет ответа на главный вопрос")
    }

   // Проверяет вхождение одной коллекции в другую.

    if (setOfNumbers.containsAll(listOf(4, 3))) {
        println("Коллекция содержит числа 4 и 3, при этом порядок не имеет значения")
    } else {
        println("В коллекции нет одного из чисел либо всех проверяемых чисел")
    }

    // sum возвращает сумму всех элементов списка чисел.

    val sumOfNumbers = numbers.sum()
    println(sumOfNumbers) //

   // возвращает среднее значение элементов списка чисел.

    val averageOfNumbers = numbers.average()
    println(averageOfNumbers) // Вывод: -0.6

   // maxOrNull возвращает максимальный элемент списка или null, если список пуст.

  //  minOrNull возвращает минимальный элемент или null.

    val maxNumber = numbers.maxOrNull()
    println(maxNumber) // Вывод: 4
    val minNumber = numbers.minOrNull()
    println(minNumber) // Вывод: -5

   // Пример: Группировка чисел по положительным и отрицательным.

    val groupedBySign = numbers.groupBy { if (it > 0) "Positive" else "Negative" }
    println(groupedBySign) // Вывод: {"Negative"=[-1, -3, -5], "Positive"=[2, 4]}

    // Возвращает список, содержащий только уникальные элементы из исходного списка.

    val distinctNumbers = listOf(1, 2, 2, 3, 3, 3, 4).distinct()
    println(distinctNumbers) // Вывод: [1, 2, 3, 4]

   // Возвращает первые n элементов списка

    println(numbers.take(3)) // Вывод: [1, 2, 3]

    // takeLast
    // Возвращает последние n элементов
    println(numbers.takeLast(3)) // Вывод: [3, 4, 5]


    //Возвращает всю коллекцию за исключением первых нескольких элементов

    println(numbers.drop(2)) // [-3, 4, -5, 8, 264]



    val a = listOf(1, 2, 3, 4, 5)

    a.forEach { println(it * it) }

    if (a.size > 5) { }
    if (a.isNotEmpty()) {} //  не пустая

    val a1 = a.getOrElse(80) {5}

    val a2 = a.joinToString(":")

    val sum = a.sum()

    val a3 = a.firstOrNull(){it < 0}

    val a4 = a.contains(6)

    val a5 = a.firstOrNull() {it in 18..30}

    val a6 = a.filterNotNull()

    val a7 = listOf("1", "22", "333", "4444", "155555", "1123")

    val a11 = a7.groupBy { it.first() }
    println(a11)

    val a8 = a7.map{it.length }

    val a9 = a7.associate { it to it.reversed() }

    val a10 = a7.sorted()
    println(a10)




}

fun filter(collection: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in collection) {
        if (i in 7..17) result.add(i)
    }
    return result
}