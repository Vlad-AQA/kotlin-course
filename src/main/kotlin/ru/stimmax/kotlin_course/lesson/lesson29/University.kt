package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson29

import com.google.gson.annotations.SerializedName

data class University(
    val name: String,
    @SerializedName("established_year") val establishedYear: Int,
    val faculties: List<Faculties>
    

)