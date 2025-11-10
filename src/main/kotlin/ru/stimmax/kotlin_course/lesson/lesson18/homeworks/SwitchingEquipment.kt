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

class WashingMachine(
    action: String,
    val serialNumber: String,
    var inclusion: Boolean,
    val capacity1: Int
) : Equipment(action, 90), WaterContainer {

    override fun open() {
        println("Барабан открыт")
    }

    override fun close() {
        println("Барабан закрыт")
    }

    override fun powerOff() {
        inclusion = false
        super.powerOn()
    }

    override fun powerOn() {
        inclusion = true
        super.powerOn()
    }

    override val capacity: Int
        get() = capacity1

    override fun fillWater(amount: Int) {
        if (inclusion) {
            if (capacity >= amount) {
                println("Идет подача воды")
            } else {
                println("Превышен обьем")
            }
        } else {
            println("Нет питания")
        }
    }

    override fun getWater(amount: Int) {
        if (inclusion) {
            println("Слив воды")
        } else {
            println("Нет питания")
        }
    }

    override fun programAction(action: String) {
        if (inclusion) {
            super.programAction(action)
        } else {
            println("Нет питания")
        }
    }
}

fun main() {

}
