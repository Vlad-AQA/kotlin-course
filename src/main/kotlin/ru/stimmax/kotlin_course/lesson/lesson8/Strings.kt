package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson8

import ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson3.name

fun main() {

    exemple1("ошибка в системе вызвала панику")
    exemple1("для завершения проекта важно")
    class  Person(val name: String, val age: Int)
  //  val person = Person(name: "Алексей", age:25)
    //val intro = "меня зовут ${person.name}, и мне ${person.age} лет"

    val details = "здесь находится ${getDetails()}"
    println(details)

    val x = 10
    val y = 20
    val resultString = "результат равен ${x + y}"
}

fun getDetails(): String {
    return "тратата"
}

fun exemple1(arg: String) {
     val rezult = when {
         arg.startsWith("ошибка") -> arg.replace(
             "ошибка", "небольшое недоразумение"
         )
         arg.endsWith("Важно", true) -> "$arg ... но не критично"
         else -> arg
     }
    println(rezult)


}