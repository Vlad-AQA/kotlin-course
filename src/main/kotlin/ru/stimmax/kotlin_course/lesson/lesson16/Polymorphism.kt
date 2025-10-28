package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson16

object Colors {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[30m"
    const val RED = "\u001B[31m"
    const val GREEN = "\u001B[32m"
    const val YELLOW = "\u001B[33m"
    const val BLUE = "\u001B[34m"
    const val PURPLE = "\u001B[35m"
    const val CYAN = "\u001B[36m"
    const val WHITE = "\u001B[37m"
}
object Background {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[40m"
    const val RED = "\u001B[41m"
    const val GREEN = "\u001B[42m"
    const val YELLOW = "\u001B[43m"
    const val BLUE = "\u001B[44m"
    const val PURPLE = "\u001B[45m"
    const val CYAN = "\u001B[46m"
    const val WHITE = "\u001B[47m"
}
fun printColored(text: String, color: String, backgroundColor: String = "") {
    println("$color$backgroundColor$text${Colors.RESET}")
}
abstract class MusicalInstrument {
    abstract fun playNote(note: String)
    protected fun shortNote(note: String, color: String) {
        printColored("Play short note $note", color)
    }
    protected fun longNote(note: String, color: String) {
        printColored("Play long note $note", color)
    }
}
 class Violin: MusicalInstrument(){
     override fun playNote(note: String) {
         longNote(note, Colors.YELLOW)
     }
 }

class Drum : MusicalInstrument() {
    override fun playNote(note: String) {
        shortNote(note, Colors.RED)
    }
}

fun main() {
    val violin = Violin()
    violin.playNote("A")
    val drum = Drum()
    drum.playNote("E")
    val band = listOf(violin,drum)
    val note = "ABCDE"
    note.forEach { note ->
        band.forEach {
            it.playNote(note.toString())
        }
    }

    val printer = Printer()
    printer.print("kjdhwfwjebf")
    printer.print("kjdhwfwjebf", Colors.PURPLE)
    printer.print("kjdhwfwjebf", Colors.BLUE, Background.WHITE)
}

class Printer() {
    fun print(text: String) {
        println(text)
    }
    fun print(text: String, color: String) {
        printColored(text, color)
    }
    fun print(text: String, color: String, backgroundColor: String) {
        printColored(text, color, backgroundColor)
    }
    fun print(texts: Array<String>) {
        texts.forEach { println(it) }
    }
    fun print(text: List<Pair<String, String>>) {
        text.forEach { printColored(it.first, it.second) }
    }
}
