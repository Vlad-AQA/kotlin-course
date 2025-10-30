package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson16.homeworks


abstract class Printer(
    val color: String,
    val background: String
) {
    abstract fun print(text: String)
}

fun main() {
    val laserPrinter = LaserPrinter(Colors.BLACK, Background.WHITE)
    laserPrinter.print("должен разбивать фразу на слова по пробелу и выводить каждое слово отдельно")
    // ВОПРОС,
    val inkjetPrinter = InkjetPrinter(Colors.BLACK, Background.WHITE)
    inkjetPrinter.print(
        "Это сделано, чтобы иметь четкие и понятные именованые константы," +
                " но при этом разработчик может сам создавать списки из тех констант," +
                " которые нужно применять в каждом конкретном случае"
    )


}