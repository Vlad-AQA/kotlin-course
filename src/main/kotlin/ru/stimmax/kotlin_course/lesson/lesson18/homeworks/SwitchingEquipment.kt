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
    val name: String,
    val maxT: Int
) : ProgrammableEquipment(action), TemperatureRegulatable, Openable {
    override fun open() {
        println("$name открыто")
    }

    override fun close() {
        println("$name закрыто")
    }

    override val maxTemperature: Int
        get() = maxT

    override fun setTemperature(temp: Int) {
        powerOn()
        println("Установлена температура $temp")
    }


}