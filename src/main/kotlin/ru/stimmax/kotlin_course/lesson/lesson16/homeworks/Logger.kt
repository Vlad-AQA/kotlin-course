package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson16.homeworks


class Logger() {
    fun log(message: String) {
        println("INFO: $message")
    }

    fun log(logLvl: String, message: String) {
        when (logLvl) {
            "WARNING" -> printColored(message, Colors.YELLOW)
            "ERROR" -> printColored(message, Colors.WHITE, Background.RED)
            else -> println("INFO: $message")
        }
    }

    fun log(message: List<String>) {
        message.forEach { println("INFO $it") }
    }

}




















