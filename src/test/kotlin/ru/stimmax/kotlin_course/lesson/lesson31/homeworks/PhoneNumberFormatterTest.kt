package ru.stimmax.kotlin_course.lesson.lesson31.homeworks

import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson31.homeworks.PhoneNumberFormatter
import kotlin.test.assertEquals

class PhoneNumberFormatterTest {

    @ParameterizedTest
    @MethodSource("positiveNumberData")
    fun `should positive format phone number`(
        number: String
    ) {
        val phoneNumberFormatter = PhoneNumberFormatter(number)
        assertEquals("+7 (922) 941-11-11", phoneNumberFormatter.getNumber())

    }

    @ParameterizedTest
    @MethodSource("negativeNumberData")
    fun `should negative format phone number`(
        number: String
    ) {
        val phoneNumberFormatter = PhoneNumberFormatter(number)
        assertThrows(IllegalArgumentException::class.java) { phoneNumberFormatter.getNumber() }

    }


    companion object {
        @JvmStatic
        fun positiveNumberData() = listOf(
            "8 (922) 941-11-11",
            "79229411111",
            "+7 922 941 11 11",
            "9229411111",
            "abc +7 922 941 11 11",
        )

        @JvmStatic
        fun negativeNumberData() = listOf(
            "12345",
            "+1 (922) 941-11-11"
        )

    }

}