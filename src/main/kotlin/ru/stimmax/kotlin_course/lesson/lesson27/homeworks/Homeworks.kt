package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson27.homeworks

import ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson27.homeworks.StatusTest.*

// Создай Enum со статусами прохождения теста (passed, broken, failed).

enum class StatusTest {
    PASSED,
    BROKEN,
    FAILED,
}

// Создай Enum с типами жилой недвижимости для сайта аренды, включая человекопонятные названия этих типов.

enum class HousingClass(val value: String) {
    ECONOM("Эконом"),      // Эконом
    COMFORT("Комфорт"),     // Комфорт
    BUSINESS("Бизнес"),    // Бизнес
    PREMIUM("Премиум"),     // Премиум
    ELITE("Элит"),

}

// Создай Enum с планетами солнечной системы, включая расстояние до солнца в астрономических единицах и вес планеты.

enum class SolarSystem(val distanceToSun: Double, val weightPlanet: Double) {
    MERCURY(0.39, 0.055),
    VENUS(0.72, 0.815),
    EARTH(1.0, 1.0),
    MARS(1.52, 0.107),
    JUPITER(5.20, 317.8),
    SATURN(9.54, 95.2),
    URANUS(19.19, 14.5),
    NEPTUNE(30.07, 17.1),
}

fun valueClass() {
    HousingClass.entries
        .sortedBy { it.name.length }
        .forEach { println(it.name) }
}

// Создай функцию, которая принимает лямбду без аргументов и возвращаемого значения и возвращает
// Enum со статусом прохождения теста в зависимости от того как выполнится принятая лямбда:
// если без исключений - PASSED
// если будет AssertionError - FAILED
// прочие исключения - BROKEN

fun getEnumValue(fn: () -> Unit): StatusTest {
    return try {
        fn()
        PASSED
    } catch (e: AssertionError) {
        FAILED
    } catch (e: Throwable) {
        BROKEN
    }
}

// Создай функцию, которая принимает лямбду и возвращает enum планеты.
// Лямбда должна принимать планету и возвращать булево значение.
// Лямбда здесь выступает в качестве фильтра, который должен отфильтровать список
// всех планет по какому-либо признаку (расстояние или вес).
// Вернуть нужно первый элемент из отфильтрованного списка или выкинуть исключение если список пустой.

fun planetEnum(fn: (SolarSystem) -> Boolean): SolarSystem {
    return SolarSystem
        .entries
        .first { fn(it) }

}
















