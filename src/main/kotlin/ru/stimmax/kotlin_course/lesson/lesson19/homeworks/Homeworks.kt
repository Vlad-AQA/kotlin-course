package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson19.homeworks

// Напиши функцию getMiddleElement с дженериком,
// которая будет принимать список и возвращать средний элемент,
// если он существует, иначе возвращать null. Например,
// у списка из четырёх элементов - среднего элемента нет.

fun <T> getMiddleElement(list: List<T>): T? {
    if (list.size % 2 != 0) {
        return list[list.size / 2]
    }
    return null
}

// Напиши класс ListHolder, который будет хранить список элементов типа T
// и иметь метод для добавления нового элемента и получения всех элементов в виде неизменяемого списка.

class ListHolder<T>(
    private val list: MutableList<T>
) {
    fun addList(item: T) {
        list.add(item)
    }

    fun getList(): List<T> {
        return list.toList()
    }

}

// Создай интерфейс Mapper с двумя дженериками, который будет определять методы для преобразования:
// элементов одного типа в элементы другого типа
// списка элементов одного типа в список элементов другого тип

interface Mapperable<A, B> {

    fun map(item: A): B

    fun mapList(list: List<A>): List<B> {
        return list.map { map(it) }
    }

}

// Создай класс PhrasesToListOfStrings и имплементируй интефрейс Mapper
// с типами String и List<String>. Метод преобразования должен разбивать
// входящую строку по символу пробела и возвращать список из полученных слов.
// Метод преобразования списков с аналогичной механикой.

class PhrasesToListOfStrings() : Mapperable<String, List<String>> {

    override fun map(item: String): List<String> {
        return item.split(" ")
    }
}

// Создай функцию transposition с двумя дженериками,
// которая принимает словарь с дженериками и возвращает словарь,
// в котором ключ и значения поменялись местами.

fun <A, B> transposition(map: Map<A, B>): Map<B, A> {
    return map.map { it.value to it.key }.toMap()
}
// Напиши интерфейс Validator с дженериком с функцией валидации,
// которая будет принимать элемент с типом дженерика и возвращать булево значение.

interface Validatorable<A> {
    fun validator(item: A): Boolean
}

// Создай класс StringValidator и имплементируй интерфейс Validator с типом String?.
// Реализуй проверку, что строка не является null, не пустая и не состоит из одних пробелов.

class StringValidator() : Validatorable<String?> {

    override fun validator(item: String?): Boolean {
        return !item.isNullOrBlank()
    }
}

// Создай класс OddValidator и имплементируй интерфейс Validator типизированный по Int.
// Реализуй проверку, что число чётное.

class OddValidator() : Validatorable<Int> {
    override fun validator(item: Int): Boolean {
        return item % 2 == 0
    }
}

fun main() {

}