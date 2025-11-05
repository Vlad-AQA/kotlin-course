package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson17

import kotlin.math.abs

fun main() {
    val iron = Iron("1", "black", 200.0F)
    iron.addWater(200.0F)
    iron.powerOn(100.0F)
    iron.letOffSteam(3)
    iron.powerOff()
}

class Iron(val model: String, val color: String, val maxWaterAmount: Float) {

    private val standByTemperature = 20f
    private var temperature: Float = standByTemperature
    private var isPowerOn: Boolean = false
    private var waterAmount: Float = 0f
    private var indicator = false

    fun powerOn(targetTemperature: Float) {
        isPowerOn = true
        println("Утюг включён")
        setTemperature(targetTemperature)
    }

    fun powerOff() {
        indicator = false
        isPowerOn = false
        println("Утюг выключен")
        changeTemperature(standByTemperature)
    }

    fun setTemperature(target: Float) {
        if (target > temperature) {
            indicator = true
        }
        changeTemperature(target)
        indicator = false
    }

    fun addWater(amount: Float): Float {
        if (amount <= 0f) return 0f
        val freeSpace = maxWaterAmount - waterAmount
        val waterForAdding = minOf(amount, freeSpace)
        waterAmount += waterForAdding
        return amount - waterForAdding
    }

    fun letOffSteam(seconds: Int): Boolean {
        if (waterAmount == 0f) return false
        val targetTime = System.currentTimeMillis() + 2 * 1000
        val steamPortion = 5f
        while (targetTime > System.currentTimeMillis()) {
            println("Пшшшшш")
            if (waterAmount >= steamPortion) {
                waterAmount -= steamPortion
            } else {
                waterAmount = 0f
                println("Вода закончилась")
                break
            }
            Thread.sleep(200)
        }
        return waterAmount > 0
    }

    fun changeTemperature(target: Float) {
        val upTemperaturePerSecond = 10f
        val downTemperaturePerSecond = 3f

        while (abs(target - temperature) > 10) {
            if (target > temperature) {
                temperature += upTemperaturePerSecond
                println("Нагрелся до $temperature")
            } else {
                temperature -= downTemperaturePerSecond
                println("Остыл до $temperature")
            }
            Thread.sleep(1000)
        }
    }
}