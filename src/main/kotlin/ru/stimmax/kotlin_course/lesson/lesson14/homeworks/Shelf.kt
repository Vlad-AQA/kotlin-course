package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson14.homeworks

// Вместимость полки (capacity): максимальная сумма букв всех названий предметов, которые могут быть размещены на полке.
// Список предметов (items): хранит названия предметов на полке.
class Shelf(val capacity: Int, val items: MutableList<String>) {

   // Добавление Предмета (addItem):
   // Принимает название предмета.
   // Проверяет, поместится ли предмет на полку, учитывая длину его названия и текущее заполнение полки.
   // Возвращает true и добавляет предмет, если есть место. В противном случае возвращает false.
    fun addItems(thing: String): Boolean{
        if ((capacity - items.sumOf { it.length }) >= thing.length) {
            items.add(thing)
            return true
        } else {
            return false
        }
    }
    // Удаление Предмета (removeItem):
    // Принимает название предмета.
    // Удаляет предмет, если он найден на полке.
    // Возвращает true, если предмет был удален, и false, если такой предмет не найден.
    fun removeItem(thing: String): Boolean {
        if (items.contains(thing)){
            items.remove(thing)
            return  true
        } else {
            println("$thing не найден")
            return false
        }
    }
    // Проверка Вместимости (canAccommodate):
    // Принимает название предмета.
    // Определяет, вместится ли предмет на полку.
    // Возвращает true, если предмет вместится, и false, если места недостаточно.
    fun canAccommodate(thing: String): Boolean {
        if ((capacity - items.sumOf { it.length }) >= thing.length) {
            println("$thing вместится на полку")
            return true
        } else {
            println("$thing не вместится на полку")
            return false
        }
    }
    // Проверка наличия предмета (containsItem):
    // Принимает название предмета
    // Возвращает true если такой предмет есть
    fun containsItem(thing: String): Boolean = items.contains(thing)

    // Получение списка предметов (getItems):
    // Возвращает неизменяемый список предметов
    fun getItemsList(): List<String> = items.toList()















}