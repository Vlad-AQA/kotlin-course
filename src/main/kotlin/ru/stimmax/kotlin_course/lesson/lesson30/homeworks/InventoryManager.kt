package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson30.homeworks

fun main() {

}

class InventoryManager(private val capacity: Int) {

    private val items = mutableMapOf<String, Int>()

    /**
     * Метод возвращает количество инвентаря. Если наименования нет, возвращает 0
     */

    fun getItemCount(itemName: String): Int = items[itemName] ?: 0 // можно и так

//    fun getItemCount(itemName: String): Int {
//        return if (items.contains(itemName)) {
//            (items.getValue(itemName))
//        } else {
//            0
//        }
//
//    }


    /**
     * Добавляет инвентарь в хранилище к существующему.
     * @param itemName название инвентаря
     * @param quantity количество инвентаря
     * @throws IllegalStateException в случае, если допустимое количество может быть превышено
     */
    fun addItem(itemName: String, quantity: Int) {
        checkCapacity(quantity)
        val nowItemCapacity = getItemCount(itemName)
        items[itemName] = nowItemCapacity + quantity


    }

    /**
     * Удаляет инвентарь из хранилища
     * @param itemName название инвентаря
     * @param quantity количество инвентаря для удаления
     * @return true если удаление произошло и false если удаление невозможно, например нет наименования или нужного количества
     */
    fun removeItem(itemName: String, quantity: Int): Boolean {

        val currentQuantity = items[itemName]
        val newQuan = currentQuantity?.minus(quantity) ?: return false

        return when {
            quantity <= 0 -> false
            quantity > currentQuantity -> false
            else -> {
                if (newQuan == 0) {
                    items.remove(itemName)
                    true
                } else {
                    items[itemName] = newQuan
                    true
                }
            }
        }
    }

    /**
     * Проверяет, что количество объектов в инвентаре с учётом добавляющихся не превысит допустимого количества
     * @param itemsForAdding количество объектов для добавления
     * @throws IllegalStateException в случае, если допустимое количество может быть превышено
     */
    private fun checkCapacity(itemsForAdding: Int) {
        check(capacity >= items.values.sum() + itemsForAdding) {
            "Количество инвентаря не должно превышать $capacity единиц"
        }
    }
}