package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson5

fun main() {
    val userLang: String? = null
    val defaultLang = "English"
    val currentLang = userLang ?:  defaultLang
    println(currentLang)

    val innerAccumulator = 5000
    val externalAccumulator: Int? = 2000
    val powerBank = innerAccumulator + (externalAccumulator  ?: 0)

    val goodsInContainer: String? = null
    val checkedGoods = goodsInContainer ?: "error"

    val price = 80.0
    val discountInPercent: Double? = null
    val discount = (discountInPercent ?: 0.0 ) / 100.0
    val discountPrice = price - price * discount





}


