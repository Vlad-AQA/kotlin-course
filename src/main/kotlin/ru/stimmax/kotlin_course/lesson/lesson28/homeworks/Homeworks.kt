package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson28.homeworks

import java.time.*
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal

fun main() {

// Создай текущую метку времени и выведи её на печать (чтобы ещё раз запомнить название этого класса)
    val now = Instant.now()
    println(now)

// Создай дату своего дня рождения.
    val myDay = LocalDate.of(1994, 7, 6)
    println(myDay)

// Создай период между датой своего рождения и текущей датой. Выведи на печать количество лет из этого периода.

    val localNow = LocalDate.now()
    val alt = Period.between(myDay, localNow)
    println(alt.years)

// Создай объекты дат и / или времени которые мы изучили и по очереди передай
// их в метод созданный выше. Не используй в них метод now()

    LocalDate.of(2025, 12, 18).apply { exe(this) }
    LocalTime.of(18, 20, 0).apply { exe1(this) }
    LocalDateTime.of(
        2025,
        12,
        18,
        18,
        20,
        0
    ).apply {
        exe(this)
    }
    ZonedDateTime.of(
        2025,
        12,
        18,
        18,
        20,
        0,
        0,
        ZoneId.of("Europe/Moscow")
    ).apply { exe(this) }


    LocalDate.of(1950, 5, 1).identifyGeneration() // Бумер
    LocalDate.of(2005, 3, 10).identifyGeneration() // Зумер
    LocalDate.of(1988, 1, 1).identifyGeneration() // Не определено


}

// Создай функцию, которая принимает тип Temporal и выводит форматированное значение
// в зависимости от того, содержит ли аргумент время и часовой пояс.
// Temporal - это общий тип для разных классов даты-времени.
// В форматированном значении нужно выводить часы, минуты, секунды и таймзону,
// если они представлены в переданном объекте. Обработай в методе все типы дат, которые знаешь.
// Реализуй два варианта функции - с собственный форматированием и с форматами из ISO коллекции.

fun exe(arg: Temporal) {
    when (arg) {
        is LocalDate -> {
            println(arg.format(DateTimeFormatter.ISO_LOCAL_DATE))
        }

        is LocalTime -> {
            println(arg.format(DateTimeFormatter.ISO_LOCAL_TIME))
        }

        is LocalDateTime -> {
            println(arg.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME))
        }

        is ZonedDateTime -> {
            println(arg.format(DateTimeFormatter.ISO_ZONED_DATE_TIME))
        }

        is Instant -> {
            println(arg.atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ISO_ZONED_DATE_TIME))
        }

        else -> println("Неизвестный тип")
    }
}

fun exe1(arg: Temporal) {
    when (arg) {
        is LocalDate -> {
            println(arg.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")))
        }

        is LocalTime -> {
            println(arg.format(DateTimeFormatter.ofPattern("HH:mm:ss")))
        }

        is LocalDateTime -> {
            println(arg.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss")))
        }

        is ZonedDateTime -> {
            println(arg.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss Z")))
        }

        is Instant -> {
            println(
                arg.atZone(ZoneId.systemDefault())
                    .format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss Z"))
            )
        }

        else -> println("Неизвестный тип")
    }
}

// Создайте функцию identifyGeneration, которая расширяет класс LocalDate и печатает строку,
// определяющую, к какому поколению принадлежит человек родившийся в эту дату: "Бумер" для тех,
// кто родился с 1946 по 1964 год включительно, и "Зумер" для тех, кто родился с 1997 по 2012 год включительно.
// Если дата рождения не попадает ни в один из этих диапазонов, функция должна печатать "Не определено".
// Для сравнения дат используй методы isAfter(otherDate) и isBefore(otherDate) или проверку вхождения в диапазон.
// Объекты с эталонными датами вынеси в приватные поля файла с методом identifyGeneration.

private val BOOMER_START: LocalDate = LocalDate.of(1946, 1, 1)
private val BOOMER_END: LocalDate = LocalDate.of(1964, 12, 31)

private val ZOOMER_START: LocalDate = LocalDate.of(1997, 1, 1)
private val ZOOMER_END: LocalDate = LocalDate.of(2012, 12, 31)

private fun LocalDate.isInRangeInclusive(start: LocalDate, end: LocalDate): Boolean {
    return !this.isBefore(start) && !this.isAfter(end)
}

fun LocalDate.identifyGeneration() {
    when {
        this.isInRangeInclusive(BOOMER_START, BOOMER_END) -> println("Бумер")
        this.isInRangeInclusive(ZOOMER_START, ZOOMER_END) -> println("Зумер")
        else -> println("Не определено")
    }
}

