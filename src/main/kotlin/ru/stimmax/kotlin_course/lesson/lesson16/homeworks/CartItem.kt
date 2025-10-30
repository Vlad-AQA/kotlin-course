package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson16.homeworks

class CartItem(
    val item: MutableMap<Int, Int>
) {
    fun addToCart(itemId: Int) {
        item[itemId] = (item[itemId] ?: 0) + 1
    }

    fun addToCart(itemId: Int, amount: Int) {
        item[itemId] = (item[itemId] ?: 0) + amount
    }

    fun addToCart(mapIdItem: Map<Int, Int>) {
        mapIdItem.forEach { item[it.key] = (item[it.key] ?: 0) + it.value }
    }

    fun addToCart(idList: List<Int>) {
        idList.forEach { item[it] = (item[it] ?: 0) + 1 }
    }
}

fun main() {
    val cartItem = CartItem(
        mutableMapOf(
            101 to 2,
            202 to 1,
            303 to 5
        )
    )

    cartItem.addToCart(7)
    println(cartItem.item)

    cartItem.addToCart(listOf(101, 303, 28))
    println(cartItem.item)

    cartItem.addToCart(7, 3)
    println(cartItem.item)

    cartItem.addToCart(mapOf(202 to 7))
    println(cartItem.item)


}