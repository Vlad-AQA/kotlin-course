package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson27.homeworks

import ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson27.homeworks.TrafficLightSignal.*

//Создай enum с перечислением для светофора.
// Enum должен включать цвет из класса Colors, длительность сигнала duration
// и количество миганий blinkTimes (может быть null).
// Мигание нужно установить только для зелёного сигнала.

//Реализовать функцию с бесконечным циклом, которая будет выводить сигналы светофора в порядке:
// красный (например 4 сек), жёлтый (например 2 сек),
// зелёный (например 3 сек), зелёный мигающий (например 4 раза).

//Отображение сигнала выполняется через showSignal(), после чего clear(), чтобы было видимое переключение.

//Мигание выполняется через попеременный вызов showSignal()
// с переопределением задержки в 300мс (второй аргумент) и clear().

enum class Colors(val value: String) {
    RED_COLOR("\u001B[31m"),
    YELLOW_COLOR("\u001B[33m"),
    GREEN_COLOR("\u001B[32m"),
    RESET_COLOR("\u001B[0m")
}

enum class TrafficLightSignal(val color: Colors, val duration: Long, val blinkTimes: Int? = null) {
    GREEN(Colors.GREEN_COLOR, 4000, 4),
    YELLOW(Colors.YELLOW_COLOR, 2000),
    RED(Colors.RED_COLOR, 4000)
}

const val LIGHT_SYMBOL = "\u25CF"

// Функция для отображения сигнала
fun showSignal(signal: TrafficLightSignal, altDuration: Long? = null) {
    print("\r" + signal.color.value + LIGHT_SYMBOL + Colors.RESET_COLOR.value) // Выводим сигнал с возвратом каретки
    Thread.sleep(altDuration ?: signal.duration)
}

fun clear() {
    print("\r    ")
    Thread.sleep(300)
}

fun main() {
    while (true) {
        showSignal(RED)
        clear()
        showSignal(YELLOW)
        clear()
        showSignal(GREEN)
        clear()
        if (GREEN.blinkTimes != null) {
            repeat(GREEN.blinkTimes) {
                showSignal(GREEN, 300)
                clear()
            }
        }
    }
}
