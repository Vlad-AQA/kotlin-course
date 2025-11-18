package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson21

interface Drivable {
    fun drive()
}

interface Flyable {
    fun fly()
}

open class Car : Drivable {

    override fun drive() {
        println("Едет как автомобиль")
    }
}

class FlyingCar : Car(), Flyable {

    override fun fly() {
        println("Летит как самолёт")
    }
}

fun checkCapabilitiesWithSmartCast(drivable: Drivable) {
    drivable.drive()
    if (drivable is Flyable) {
        drivable.fly()
    } else {
        println("Этот объект не может летать.")
    }
}

fun checkCapabilities(drivable: Drivable) {
    drivable.drive()
    (drivable as? Flyable)?.fly() ?: println("Этот объект не может летать.")
}

fun main() {
    val car = Car()
    checkCapabilities(car)

    val flyingCar = FlyingCar()
    checkCapabilities(flyingCar)
}
