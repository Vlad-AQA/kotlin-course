package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson16.homeworks

object Colors {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[30m"
    const val RED = "\u001B[31m"
    const val GREEN = "\u001B[32m"
    const val YELLOW = "\u001B[33m"
    const val BLUE = "\u001B[34m"
    const val PURPLE = "\u001B[35m"
    const val CYAN = "\u001B[36m"
    const val WHITE = "\u001B[37m"
}

object Background {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[40m"
    const val RED = "\u001B[41m"
    const val GREEN = "\u001B[42m"
    const val YELLOW = "\u001B[43m"
    const val BLUE = "\u001B[44m"
    const val PURPLE = "\u001B[45m"
    const val CYAN = "\u001B[46m"
    const val WHITE = "\u001B[47m"
}

fun printColored(text: String, color: String, backgroundColor: String = "") {
    println("$color$backgroundColor$text${ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson16.Colors.RESET}")
}

abstract class Animal(
    val name: String,
    val color: String
) {
    open fun makeSound() {
        printColored("This animal name is $name makes no sound", color)
    }
}

fun main() {

    val bird = Bird("YUYU", Colors.WHITE)
    bird.makeSound()

    val dog = Dog("Watson", Colors.RED)
    dog.makeSound()

    val cat = Cat("Killa", Colors.BLUE)
    cat.makeSound()

    val animalList = listOf(bird, cat, dog)
    for (i in animalList) {
        i.makeSound().toString()
    }
}

