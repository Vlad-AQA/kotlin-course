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
