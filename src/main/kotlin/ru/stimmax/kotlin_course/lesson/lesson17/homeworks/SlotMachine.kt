package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson17.homeworks

class SlotMachine(
    val color: String, val model: String, val pinKod: String, val joystick: Boolean
) {
    private var enabled = false
    private var osLoaded = false
    private var listOfGames = mutableListOf<String>()
    private var balance = 0.0
    private val owner = ""
    val supportPhone = "7555555555"
    var gameSessionPaid = false
    var gameSessionCost: Double = 0.0

    fun turnOn(): Boolean {
        enabled = true
        return enabled
    }

    fun turnOff(): Boolean {
        enabled = false
        return enabled
    }

    fun osLoad() {
        turnOn()
        osLoaded = true
    }

    fun ocOff() {
        turnOff()
        osLoaded = false
    }

    fun openGamesList(): MutableList<String> {
        turnOn()
        osLoad()
        return listOfGames
    }

    fun playGame(index: Int): String {
        openGamesList()
        paymentGame()
        return listOfGames[index]
    }

    private fun paymentGame() {
        gameSessionPaid = true
    }

    fun issueCash(pinKod: String, money: Double): Double {
        return if (this.pinKod == pinKod && money > 0.0) {
            if (balance >= money) {
                balance -= money
                money
            } else {
                println("Ваш баланс $balance")
                balance
            }

        } else {
            println("Неверный ПИН")
            0.0
        }
    }

    fun openSafe(money: Double): Double {
        return if (balance >= money && money > 0.0) {
            balance -= money
            money
        } else {
            println("Недостаточно средств")
            balance
        }
    }
}

