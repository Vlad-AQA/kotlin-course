package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson14

data class Dish(
    val name: String,
    val ingredients: List<String>,
    val price: Double
) {
    fun describeDish() {
        println("Dish: $name, Price: $$price, Ingredients: ${ingredients.joinToString(", ")}")
    }
}

