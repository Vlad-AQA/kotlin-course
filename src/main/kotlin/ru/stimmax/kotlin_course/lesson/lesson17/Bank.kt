package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson17

class Bank(private var pinKod: String) {

    private var balance: Double = 0.0


    fun getBalance(pinKod: String): Double {
        return if (checkPin(pinKod)) {
            balance
        } else {
            0.0
        }
    }

    fun addBalance(pinKod: String, money: Double) {
        if (checkPin(pinKod) && money > 0.0) {
            balance += money
        }
    }

    private fun checkPin(pinKod: String): Boolean {
        return if (this.pinKod == pinKod) {
            true
        } else {
            println("Неверный ПИН")
            false
        }
    }

    fun withDraw(pinKod: String, money: Double): Double {
        if (checkPin(pinKod) && money > 0.0) {
            if (balance > money) {
                balance -= money
                return money
            } else {
                val b2 = balance
                balance = 0.0
                return b2
            }
        } else {
            return 0.0
        }
    }
}