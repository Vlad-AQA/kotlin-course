package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson25.homeworks

class Person(val name: String, val age: Int) {
    var email: String = ""
}

class Employee(val name: String, val age: Int, val position: String) {
    var email: String = ""
    var department: String = "General"
}

fun main() {

    val employee = Employee("Володя", 19, "разработчик").apply {
        email = "vova@ova"
        department = "Digital"
    }
    println(employee.email)

}