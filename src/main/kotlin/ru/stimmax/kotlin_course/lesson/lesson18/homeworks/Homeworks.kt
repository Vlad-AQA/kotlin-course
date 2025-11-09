package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson18.homeworks

import java.io.InputStream

interface Powerable {
    fun powerOn()
    fun powerOff()
}

interface Openable {
    fun open()
    fun close()
}

interface WaterContainer {
    val capacity: Int
    fun fillWater(amount: Int)
    fun getWater(amount: Int)
}

interface TemperatureRegulatable {
    val maxTemperature: Int
    fun setTemperature(temp: Int)
}

interface WaterConnection {
    fun connectToWaterSupply()
    fun getWater(amount: Int)
}

interface AutomaticShutdown {
    val sensorType: String
    val maxSensoredValue: Int
    fun startMonitoring()
}

interface Drainable {
    fun connectToDrain()
    fun drain()
}

interface Timable {
    fun setTimer(time: Int)
}

interface BatteryOperated {
    fun getCapacity(): Double
    fun replaceBattery()
}

interface Mechanical {
    fun performMechanicalAction()
}

interface LightEmitting {
    fun emitLight()
    fun completeLiteEmission()
}

interface SoundEmitting {
    fun setVolume(volume: Int)
    fun mute()
    fun playSound(stream: InputStream)
}

interface Programmable {
    fun programAction(action: String)
    fun execute()
}

interface Movable {
    fun move(direction: String, distance: Int)
}

interface Cleanable {
    fun clean()
}

interface Rechargeable {
    fun getChargeLevel(): Double
    fun recharge()
}

abstract class Refrigerator() : Powerable, Openable, TemperatureRegulatable, LightEmitting

abstract class WashingMachine() : Powerable, Openable, Programmable, AutomaticShutdown, WaterConnection, WaterContainer,
    Drainable

abstract class SmartLamp() : Powerable, Openable, Rechargeable, LightEmitting

abstract class DigitalWatch() : Powerable, Rechargeable, LightEmitting, SoundEmitting, Timable

abstract class RobotVacuumCleaner() : Powerable, Programmable, Rechargeable, WaterContainer, AutomaticShutdown, Openable

abstract class MechanicalWatch() : Mechanical

abstract class Flashlight() : Powerable, Openable, BatteryOperated, LightEmitting

abstract class CoffeeMachine() : Powerable, WaterContainer, Openable, Cleanable, AutomaticShutdown

abstract class SmartSpeaker() : Powerable, Rechargeable, AutomaticShutdown, Programmable, SoundEmitting, Movable

