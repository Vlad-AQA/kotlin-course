package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson16.homeworks

class Bird(

    name: String,
    color: String

) : Animal(name, color) {
    override fun makeSound() {
        printColored("This animal name is $name makes 'Tweet'", color)
    }
}