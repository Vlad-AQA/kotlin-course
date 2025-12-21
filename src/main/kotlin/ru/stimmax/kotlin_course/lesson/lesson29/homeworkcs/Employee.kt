package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson29.homeworkcs

// Создай дата класс сотрудника компании Employee, содержащий:
// имя
// статус трудоустройства (булево)
// дата рождения (строка)
// должность CharacterTypes
// список подчинённых с типом Employee

data class Employee(
    val name: String,
    val status: Boolean,
    val dataBirth: String,
    val subordinates: List<Employee>
)
