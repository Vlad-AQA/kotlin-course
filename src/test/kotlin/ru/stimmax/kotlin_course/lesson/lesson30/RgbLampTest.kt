package ru.stimmax.kotlin_course.lesson.lesson30

import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson30.RgbLamp
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class RgbLampTest {

    private val lamp = RgbLamp()

    @BeforeEach
    fun setup() {
        lamp.powerOn()
    }


    @Test
    fun powerOnLampTest() {
        val lamp1 = RgbLamp()
        assertTrue { lamp1.powerOn() }
    }

    @Test
    fun `power Off Lamp Test`() {
        assertFalse { RgbLamp().powerOff() }
    }

    @Test
    fun `red color setup test`() {
        lamp.setRed("1F")
        assertEquals("#1F0000", lamp.getColor())
    }

    @Test
    fun `blue setup lamp test`() {
        lamp.setBlue("01")
        assertEquals("#000001", lamp.getColor())
    }

    @Test
    fun `checkHex throw test`() {
        val lamp = RgbLamp()
        lamp.powerOn()
        assertThrows(IllegalArgumentException::class.java) {
            lamp.setRed("LL")

        }
    }

}