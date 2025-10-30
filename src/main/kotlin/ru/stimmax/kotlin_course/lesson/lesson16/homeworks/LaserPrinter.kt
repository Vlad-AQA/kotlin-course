package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson16.homeworks


class LaserPrinter(
    color: String,
    background: String
) : Printer(color, background) {
    override fun print(text: String) {
        printColored(text.split(" ").toString(), Colors.BLACK, Background.WHITE)
    }
}