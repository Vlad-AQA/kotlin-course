package ru.stimmax.kotlin_course.lesson.lesson31

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.test.assertEquals

class DiscounterTest {

    @ParameterizedTest
    @MethodSource("exe")
    fun `calculate Single Discount price`(
        dateOfBirth: String,
        price: Double,
        discount: Double

    ) {
        val client = ClientProfile(dateOfBirth)
        val discounter = Discounter()
        val actualDis = discounter.calculateSingleDiscount(client, price, 1)
        assertEquals(discount, actualDis, 0.01)

    }

    companion object {
        @JvmStatic
        fun exe(): List<Array<Any?>> {
            val format = DateTimeFormatter.ofPattern("yyyy.MM.dd")
            val six = LocalDate
                .now()
                .minusYears(60)
                .format(format)
            val sixPlus = LocalDate
                .now()
                .minusYears(60)
                .plusDays(1)
                .format(format)
            val sixMinus = LocalDate
                .now()
                .minusYears(60)
                .minusDays(1)
                .format(format)
            return listOf(
                arrayOf(six, 100.0, 10.0),
                arrayOf(sixPlus, 100.0, 0.0),
                arrayOf(sixMinus, 100.0, 10.0)
            )

        }
    }
}

