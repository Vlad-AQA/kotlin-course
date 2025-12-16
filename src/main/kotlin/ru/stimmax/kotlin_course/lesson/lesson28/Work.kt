package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson28

import java.time.*
import java.time.format.DateTimeFormatter

fun main() {
    Instant.now()
    val a = Instant.ofEpochSecond(99999)
    println(a)

    val a1 = LocalDate.of(2023, 9, 1)

    val a3 = LocalDate.of(2025, 5, 31)

    val a4 = Period.between(a1, a3)
    println(a4)

    val a5 = Period.of(2, 3, 24)
    println(a4 + a5)

//    val a6 = ZonedDateTime.of(2025,
//        12, 22,00,00, ZoneId.of("Europe"))

    val b = LocalDate.of(2025, 12, 22)

    val c = LocalTime.of(10, 0, 0)
    ZonedDateTime.of(b, c, ZoneId.of("Europe/Moscow"))

    val i = b.atTime(c).atZone(ZoneId.of("Europe/Moscow"))

    val j = i.plusDays(11).plusHours(5)

    val k = DateTimeFormatter.ofPattern("'Days' dd, 'Hours:' HH")

    println(j.format(k))

}