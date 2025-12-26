package ru.stimmax.kotlin_course.lesson.lesson30

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson30.Calculator
import kotlin.test.assertEquals

class Mytest {

    @BeforeEach
    fun setUp() {

    }

    @Test
    // @Ignore
    fun additionTest() {
        // Предположим, есть класс Calculator с методом add()
        val calc = Calculator()

        assertEquals(5.0, calc.add(2.0, 3.0), "2 + 3 должно быть равно 5")
    }

    @Test
    fun additionTest2() {
        // Предположим, есть класс Calculator с методом add()
        val calc = Calculator()

        assertEquals(3.0, calc.add(9.0, 4.0), "2 + 3 должно быть равно 5")
    }


}


