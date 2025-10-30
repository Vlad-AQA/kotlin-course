package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson16.homeworks

class Dog(

    name: String,
    color: String

) : Animal(name, color) {
    override fun makeSound() {
        println("This animal name is $name makes 'Bark'")
    }
}