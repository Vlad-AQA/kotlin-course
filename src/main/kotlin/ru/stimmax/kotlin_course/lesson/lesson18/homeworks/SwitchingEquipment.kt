package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson18.homeworks


abstract class SwitchingEquipment() : Powerable {
    override fun powerOn() {
        println("Включили")
    }

    override fun powerOff() {
        println("Выключили")
    }
}

abstract class ProgrammableEquipment(
    var action: String

) : SwitchingEquipment(), Programmable {

    override fun programAction(action: String) {
        powerOn()
        this.action = action
        println("Выбрана программа $action")
    }

    override fun execute() {
        println("Запущена программа $action")
    }

}

abstract class Equipment(
    action: String,
    val maxT: Int
) : ProgrammableEquipment(action), TemperatureRegulatable, Openable {
    override fun open() {
        println("Устройство открыто")
    }

    override fun close() {
        println("Устройство закрыто")
    }

    override val maxTemperature: Int
        get() = maxT

    override fun setTemperature(temp: Int) {
        println("Установлена температура $temp")
    }
}

class Refrigerator(
    action: String,
    val serialNumber: String,
    var inclusion: Boolean = false,
    var openDoor: Boolean = false

) : Equipment(action, maxT = 10) {

    override fun powerOn() {
        inclusion = true
        super.powerOn()
    }

    override fun setTemperature(temp: Int) {
        if (inclusion) {
            super.setTemperature(temp)
        } else {
            println("Холодильник не включен")
        }
    }

    override fun open() {
        openDoor = true
        super.open()
    }

    override fun close() {
        openDoor = false
        super.close()
    }
}