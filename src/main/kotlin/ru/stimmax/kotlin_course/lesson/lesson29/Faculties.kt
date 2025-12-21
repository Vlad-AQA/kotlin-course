package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson29

import com.google.gson.annotations.SerializedName

data class Faculties(
    val name: String,
    val dean: String,
    @SerializedName("launch_year") val launchYear: Int,
    val students: List<Students>
)
