package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson16.homeworks

class InkjetPrinter(
    color: String,
    background: String
) : Printer(color, background) {
    val colorBackgroundPairs = listOf(
        Colors.RED to Background.WHITE,
        Colors.GREEN to Background.BLACK,
        Colors.BLUE to Background.YELLOW,
        Colors.YELLOW to Background.CYAN,
        Colors.PURPLE to Background.GREEN,
        Colors.CYAN to Background.RED
    )

    override fun print(text: String) {
        val words = text.split(" ")
        var pairIndex = 0
        for (word in words) {
            val (clr, bg) = colorBackgroundPairs[pairIndex]
            printColored(word, clr, bg)
            pairIndex++
            if (pairIndex == colorBackgroundPairs.size) {
                pairIndex = 0
            }
        }
    }
}