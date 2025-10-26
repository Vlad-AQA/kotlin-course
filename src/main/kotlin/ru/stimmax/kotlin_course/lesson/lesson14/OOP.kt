package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson14

import ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson14.homeworks.Concert
import ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson14.homeworks.Emotion
import ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson14.homeworks.Moon
import ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson14.homeworks.Party
import ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson14.homeworks.Product
import ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson14.homeworks.Rack
import ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson14.homeworks.Shelf
import kotlin.math.E


fun main() {


    val reservedSeatCarriage = Carriage(48)
    val compartmentCarriage = Carriage(16, "Купе")
    val train = Train("Electric locomotive")
    train.carriages.add(reservedSeatCarriage)
    train.carriages.add(compartmentCarriage)
    val passengerAlexandr = Passenger("Alexandr", "1983-10-02", "7777777")
    train.boardPassenger(passengerAlexandr, 10, "Купе")

    val lamp = Lamp(false)
    lamp.toggle()  // The lamp is on
    lamp.toggle()  // The lamp is off


    val wind = Wind(36)
    val speedInMetersPerSecond = wind.convertToMetersPerSecond()
    println("Speed in meters per second: $speedInMetersPerSecond")


    Sun.shine()  // The sun is shining with a temperature of 5500°C.


    val car = Car("Toyota", "Camry")
    car.showInfo()  // Car brand: Toyota, model: Camry
    println("Popular car brands: ${Car.popularBrands}")

    wind.setSpeed(125)
    wind.printSpeed()

    Sun.shine()

    val pasta = Dish("Pasta Carbonara", listOf("Pasta", "Eggs", "Parmesan", "Bacon"), 12.99)
    pasta.describeDish()  // Dish: Pasta Carbonara, Price: $12.99, Ingredients: Pasta, Eggs, Parmesan, Bacon

    val party = Party("Москва", 55)

    party.details()

    val emotion = Emotion("Страх", 7)
    emotion.express()

    Moon.showPhase()

    val product = Product("Шляпа", 100.0, 1)
    println("Цена ${product.name} ${product.prices()}")

    val concert = Concert("ДДТ", "Москва", 5000.0, 5000, 0)
    concert.info()
    concert.buyTicket()
    concert.info()

    val shelf = Shelf(50, mutableListOf())
    val shelf1 = Shelf(50, mutableListOf())
    val a = shelf.addItems("нога")
    println(a)
    val b = shelf.getItemsList()
    println(b)

    val rack = Rack(mutableListOf(shelf, shelf1), 10)

}
