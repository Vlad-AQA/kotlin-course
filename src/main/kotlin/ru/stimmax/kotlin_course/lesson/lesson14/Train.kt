package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson14

class Train(val engineType: String) {
    val carriages = mutableListOf<Carriage>()
    fun boardPassenger(
        passenger: Passenger,
        seat: Int,
        carriageType: String
    ) {
        // логика для размещения пассажира
    }
}