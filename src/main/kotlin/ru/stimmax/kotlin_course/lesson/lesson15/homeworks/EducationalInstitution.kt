package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson15.homeworks

abstract class EducationalInstitutions(
    val name: String,
    val license: Int,

) {
    private val listStudents = mutableListOf<String>()

    fun addStudent(student: String) {
        listStudents.add(student)
    }
}

open class School(
    name: String,
    license: Int,
    val number: Int,
    val numberСlasses: Int,
    val student: String,
    val teacher: String
): EducationalInstitutions(name, license) {

    private val teachersList = mutableListOf<String>()

    fun teachersList(teacher: String) {
        teachersList.add(teacher)
    }
}

class Institute(
    name: String,
    license: Int,
    val student: String,
    val teacher: String

): EducationalInstitutions(name, license) {

    private val teachersList = mutableListOf<String>()

    fun teachersList(teacher: String) {
        teachersList.add(teacher)
    }
}
class HighSchool(
    name: String,
    license: Int,
    number: Int,
    numberСlasses: Int,
    student: String,
    teacher: String,
    val profile: String
): School(name, license, number, numberСlasses, student, teacher ){

}
class JuniorSchool(
    name: String,
    license: Int,
    number: Int,
    numberСlasses: Int,
    student: String,
    teacher: String,
    val ageRange: String

): School(name, license, number, numberСlasses, student, teacher ){

}
