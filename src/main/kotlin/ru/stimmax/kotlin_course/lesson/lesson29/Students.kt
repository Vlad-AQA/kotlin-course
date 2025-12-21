package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson29

import com.google.gson.annotations.SerializedName

data class Students(
    @SerializedName("first_name") val firstName: String,
    @SerializedName("last_name") val lastName: String,
    val age: Int,
    val gender: Gender

)
