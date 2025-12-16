package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson28

import java.time.*
import java.time.format.DateTimeFormatter

fun main(
) {

    LocalDate.now()
    LocalDate.of(1983, 10, 2)

    LocalTime.now()
    LocalTime.of(18, 0, 0)

    LocalDateTime.now()
    LocalDateTime.of(2024, 4, 1, 9, 0, 0)


    // Примеры ZoneId: "Europe/Paris", "America/New_York".
    ZonedDateTime.now(ZoneId.of("Europe/Vatican"))
    ZonedDateTime.of(
        2024,
        2,
        26,
        10,
        0,
        0,
        0,
        ZoneId.of("Europe/Madrid")
    )


    // Примеры ZoneOffset: "+02:00", "-05:00".
//    OffsetDateTime.of(birthday.atTime(19, 0), ZoneOffset.of("+09:00"))
//
//    vaticanCurrentTime.toInstant()
//    birthday.atTime(19, 0).toInstant(ZoneOffset.of("+09:00"))
//    instant.atZone(ZoneId.systemDefault())
//    instant.atOffset(ZoneOffset.of("-02:00"))

    LocalDate.now().plusYears(1) //  Добавить один год к текущей дате
    LocalDateTime.now().plusSeconds(1) // Добавить одну секунду к текущей дате и времени

    LocalDate.now().minusYears(1) // Вычесть один год из текущей даты
    LocalDateTime.now().minusSeconds(1) // Вычесть одну секунду из текущей даты и времени

//    Period.between(startDate, endDate) // Получить разницу между двумя датами в годах, месяцах и днях
//    Duration.between(
//        startDateTime,
//        endDateTime
    // Получить разницу между двумя моментами времени в часах, минутах и секундах

//    Больше: date1.isAfter(date2) // Проверяет, больше ли date1, чем date2
//    Меньше: date1.isBefore(date2) // Проверяет, меньше ли date1, чем date2
//
    val nanoSeconds = Duration.ofNanos(200)
    println(nanoSeconds.dividedBy(4).toNanos())
    println(nanoSeconds.plus(Duration.ofSeconds(2)).toNanos())
    val seconds = Duration.ofSeconds(45)
    println(seconds.minusMinutes(1).seconds)
    val period = Period.of(2, 4, 10)
    println(period.minusMonths(13).toTotalMonths())

//    Парсинг дат с использованием форматтера
//    val parsedDate = LocalDate.parse(prettyFormattedDate, prettyFormatter)
//    println(parsedDate)
}

//    val periodFromConferenceToBirthday = Period.between(mobileWorldCongress.toLocalDate(), birthday)
//    println("${periodFromConferenceToBirthday.years}" +
//            " лет ${periodFromConferenceToBirthday.months}" +
//            " месяцев ${periodFromConferenceToBirthday.days} дней")
//
val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS ZZZ")

//    val formattedDate = vaticanCurrentTime.format(formatter)
//    println("Текущая дата и время с миллисекундами и часовым поясом: $formattedDate")
val isoFormatter = DateTimeFormatter.ISO_DATE_TIME

//    val isoFormattedDate = birthdayInDubai.format(isoFormatter)
//    println(isoFormattedDate)
val prettyFormatter = DateTimeFormatter.ofPattern("'год' yyyy', месяц' MM', день' dd")
//    val prettyFormattedDate = dateTimeNow.format(prettyFormatter)
//    println(prettyFormattedDate)
//    try {
//        println(
//            "При форматировании с часовым поясом помни, что в LocalDateTime его нет и будет ошибка ${
//                localDateTime.format(
//                    formatter
//                )
//            }"
//        )
//    } catch (e: Throwable) {
//        e.printStackTrace()
//    }
//    try {
//        println("При форматировании LocalDate помни, что нет полей времени и будет ошибка ${birthday.format(formatter)}")
//    } catch (e: Throwable) {
//        e.printStackTrace()
////    }
//    }
//}


