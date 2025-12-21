package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson29.homeworkcs

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.io.File

// Создай дата класс сотрудника компании Employee, содержащий:
// имя
// статус трудоустройства (булево)
// дата рождения (строка)
// должность CharacterTypes
// список подчинённых с типом Employee

data class Employee(
    val name: String,
    val status: Boolean,
    val dateBirth: String,
    val jobTitle: CharacterTypes,
    val subordinates: List<Employee?> = emptyList()
)

// Создай объекты рабочей группы так, чтобы у CTO был PM и CRM, у PM было два тим-лида
// (на фронт и бэк) и у каждого было по группе сотрудников подходящего для его стека профиля.

fun main() {

    val front = Employee(
        "Андрей",
        true,
        "01.01.1992",
        CharacterTypes.FRONTEND_DEV,
        emptyList()
    )

    val front2 = Employee(
        "Алексей",
        true,
        "07.02.1990",
        CharacterTypes.FRONTEND_DEV,
        emptyList()
    )
    val back = Employee(
        "Руслан",
        true,
        "27.06.1990",
        CharacterTypes.BACKEND_DEV,
        emptyList()
    )
    val back2 = Employee(
        "Сергей",
        true,
        "08.08.1999",
        CharacterTypes.BACKEND_DEV,
        emptyList()
    )

    val teamLeadFront = Employee(
        "Джафар",
        true,
        "09.05.1987",
        CharacterTypes.TEAM_LEAD,
        listOf(front, front2)
    )

    val timLidBack = Employee(
        "Денис",
        true,
        "19.03.1988",
        CharacterTypes.TEAM_LEAD,
        listOf(back, back2)
    )
    val productManager = Employee(
        "Валера",
        true,
        "10.10.1985",
        CharacterTypes.PM,
        listOf(timLidBack, teamLeadFront)
    )

    val crm = Employee(
        "Павел",
        true,
        "11.11.1986",
        CharacterTypes.CRM,
        emptyList()
    )

    val cto = Employee(
        "Влад",
        true,
        "06.07.1994",
        CharacterTypes.CTO,
        listOf(crm, productManager)
    )

    ex(cto)
    ex1(File("src/main/resources/CTO.json"))

}

// Создай функцию в которой:
// сериализуй CTO в текст с настройкой prettyPrinting
// текст запиши в файл в корне проекта.

fun ex(cto: Employee) {

    val gson = GsonBuilder()
        .setPrettyPrinting()
        .create()
    gson.toJson(cto)
        .also {
            File("src/main/resources/CTO.json")
                .writeText(it)
        }

}

// Создай функцию в которой:
// прочитай текст из файла
// десериализуй его в объект класса Employee
// распечатай в консоль


fun ex1(file: File) {
    file.readText().also {
        Gson().fromJson(it, Employee::class.java).run {
            println(this)
        }
    }
}




















