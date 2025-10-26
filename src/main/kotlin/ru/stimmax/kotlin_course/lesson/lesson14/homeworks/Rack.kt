package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson14.homeworks

import kotlin.io.println

// Список полок (shelves): хранит полки стеллажа.
// Максимальное количество полок.
class Rack(val shelves: MutableList<Shelf>, val quantity: Int) {

    // Добавление Полки (addShelf):
    // Добавляет новую полку в стеллаж.
    // Возвращает true, если полка была успешно добавлена или false
    // если стеллаж уже заполнен или была попытка добавить полку которая уже установлена.
    fun addShelf(shelf: Shelf): Boolean {
        if (shelves.size < quantity && !shelves.contains(shelf)) {
            shelves.add(shelf)
            return  true
        } else {
            return  false
        }
    }
    // Удаление Полки (removeShelf):
    // Принимает индекс полки для удаления.
    // Удаляет полку по указанному индексу.
    // Возвращает список предметов полки, если полка была успешно удалена или пустой список если полка не существует.
    fun removeShelf(index: Int): List<String?> {
        return if (index in shelves.indices) {
            shelves.removeAt(index).items
        } else {
            return emptyList()
        }
    }
    // Добавление Предмета (addItem):
    // Добавляет предмет на первую свободную полку.
    // Возвращает true, если предмет успешно добавлен, и false, если на всех полках недостаточно места.
    fun addItem(thing: String): Boolean {
        for (shelf in shelves) {
            if (shelf.addItems(thing))
                return true
        }
        return false
    }
    // Удаление Предмета (removeItem):
    // Находит и удаляет только один предмет с любой полки.
    // Возвращает true, если предмет был удален, и false, если такой предмет не найден.
    fun removeItem(thing: String): Boolean {
        for (shelf in shelves) {
            if (shelf.removeItem(thing)) {
                return true
            }
        }
        return false
    }
    // Печать Содержимого (printContents):
    // Выводит в консоль информацию о каждой полке: индекс,
    // вместимость, оставшуюся вместимость, список предметов. Информацию выводить в наглядном читаемом виде
    fun printContents(): Unit {
        for (index in shelves.indices) {
            val remaining = shelves[index].capacity - shelves[index].items.sumOf { it.length }
            println(
                "На полке ${shelves[index]} с индексом $index " +
                    "с вместимостью ${shelves[index].capacity} находятся такие предметы" +
                    "${shelves[index].items} оставшаяся вместимость $remaining")
        }

    }
    // Сложное удаление полки (advancedRemoveShelf):
    // Принимает индекс полки для удаления
    // Перераспределяет предметы по имеющимся полкам, начиная с самых длинных.
    // Если очередной предмет никуда не вмещается, его нужно пропустить и попробовать разместить следующий.
    // Удаляет полку с оставшимися предметами
    // Возвращает неизменяемый список предметов,
    // которые не удалось удалить или пустой список если полки с таким индексом нет.
    fun advancedRemoveShelf(index: Int): List<String> {
        if (index !in shelves.indices) {
            return emptyList()
        }
        val notReplacedItems = mutableListOf<String>()
        val otherShelves = shelves - shelves[index]
        for (item in shelves[index].getItemsList()) {
            if (otherShelves.none { it.addItems(item) }) {
                notReplacedItems.add(item)
            }
        }
        shelves.removeAt(index)
        return notReplacedItems.toList()
    }
}

