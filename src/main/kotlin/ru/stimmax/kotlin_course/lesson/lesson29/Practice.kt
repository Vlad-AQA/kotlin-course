package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson29

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.io.File

fun main() {

    ex()
    ex1()

}

fun ex() {

    val stud = Students("A", "B", 1, Gender.MALE)
    val stud2 = Students("C", "D", 12, Gender.FEMALE)
    val fac = Faculties("", "", 2000, listOf(stud, stud2))
    val uni = University("Tech", 1905, listOf(fac))

    val gson = GsonBuilder()
        .setPrettyPrinting()
        .create()
    gson.toJson(uni)
        .also {
            File("src/main/resources/uni.json")
                .writeText(it)
        }

}

fun ex1() {
    val json = File("src/main/resources/uni.json").readText()
    val gson = Gson()
    gson.fromJson(json, University::class.java).also { it ->
        it.faculties.forEach {
            it.students.forEach {
                println(
                    "${it.firstName}  ${it.lastName}"
                )
            }
        }
    }

}




















