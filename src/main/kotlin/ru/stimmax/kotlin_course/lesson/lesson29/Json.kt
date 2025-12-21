package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson29

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.annotations.SerializedName


data class Address(
    val street: String,
    val city: String,
    val postalCode: Int
)

data class User(
    val id: Int,
    val name: String,
    val isActive: Boolean,
    val address: Address
)

data class UserWithAlias(
    @SerializedName("user_id") val id: Int,
    @SerializedName("full_name") val name: String,
    val isActive: Boolean
)


fun main() {
    val address = Address("Baker Street", "London", 221)
    val user = User(1, "Sherlock Holmes", true, address)
    val gson = Gson() // Создаём экземпляр Gson
    val json = gson.toJson(user) // Сериализация объекта
    println("JSON: $json")

    val user2 = gson.fromJson(json, User::class.java) // Десериализация JSON в объект
    println("User: $user2")

    val json1 = """{"user_id":2,"full_name":"John Watson","isActive":false}"""
    val user3 = gson.fromJson(json1, UserWithAlias::class.java)
    println("User with alias: $user3")

    val gson1 = GsonBuilder()
        .setPrettyPrinting() // Для красивого форматирования JSON
        .serializeNulls() // Включить null-поля в JSON
        .create()
    val user4 = User(3, "Mary Morstan", false, Address("Fleet Street", "London", 123))
    val json2 = gson1.toJson(user4)
    println("Pretty JSON:\n$json2")


}



















