package ru.stimmax.kotlin_course.lesson.lesson31.homeworks

class PhoneNumberFormatter(
    private val lowNumber: String,

    ) {
    private val numberFormat: String by lazy {
        formatPhoneNumber(lowNumber)
    }

    private fun formatPhoneNumber(number: String): String {
        val format = number.replace(
            "\\D".toRegex(),
            replacement = ""
        )
        if (format.length != 10 && format.length != 11) {
            throw IllegalArgumentException("Введите корректный номер")
        } else when {
            format.length == 10 -> return "7$format"
            format[0] == '7' -> return format
            format[0] == '8' -> return format.replaceFirstChar { '7' }
            else -> throw IllegalArgumentException("Введите корректный номер")
        }

    }


    fun numberF(): String {
        val countryCode = numberFormat.substring(0, 1)
        val region = numberFormat.substring(1, 4)
        val part1 = numberFormat.substring(4, 7)
        val part2 = numberFormat.substring(7, 9)
        val part3 = numberFormat.substring(9, 11)
        return "+$countryCode ($region) $part1-$part2-$part3"
    }

}