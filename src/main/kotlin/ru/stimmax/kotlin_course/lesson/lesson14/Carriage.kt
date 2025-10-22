package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson14

class Carriage(val capacity: Int, val type: String = "Плацкарт") {
    private val passengers = mutableMapOf<Int, Passenger>()
    fun boardPassenger(passenger: Passenger, seat: Int) {
        if (passengers.size < capacity) {
            passengers[seat] = (passenger)
        }
    }
    fun passengerGetOff(seat: Int) {
        passengers.remove(seat)
    }
}