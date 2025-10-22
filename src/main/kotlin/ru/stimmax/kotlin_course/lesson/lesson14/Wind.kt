package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson14

class Wind(private var speed: Int) {


    fun convertToMetersPerSecond(): Double {
        return speed / 3.6
    }

    fun setSpeed(speed: Int) {
        if (speed < 0)
            return
        else {
            this.speed = speed
        }
    }

    fun printSpeed() {
        println(this.speed)
    }
}