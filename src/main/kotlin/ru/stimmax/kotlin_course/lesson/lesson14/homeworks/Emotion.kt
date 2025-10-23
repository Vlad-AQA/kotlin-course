package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson14.homeworks


// Аспект реальности: эмоция. Создайте класс Emotion, который представляет эмоцию.
// У него должно быть свойство type (String) и intensity (Int).
// Добавьте метод express(), который выводит описание эмоции в зависимости от её типа и интенсивности.
class Emotion(val type: String, val intensity: Int ) {
    fun express() {
        when {
            type.lowercase().startsWith("р") && intensity in 1..5  ->
                println("Вы испытываете умеренную $type")
            type.lowercase().startsWith("р") && intensity > 5 ->
                println("Вы испытываете сильную $type")
            type.lowercase().startsWith("г") && intensity in 1..5 ->
                println("Вы испытываете умеренную $type")
            type.lowercase().startsWith("г") && intensity > 5 ->
                println("Вы испытываете сильную $type")
            type.lowercase().startsWith("з") && intensity in 1..5 ->
                println("Вы испытываете умеренную $type")
            type.lowercase().startsWith("з") && intensity > 5 ->
                println("Вы испытываете сильную $type")
            type.lowercase().startsWith("с") && intensity in 1..5 ->
                println("Вы испытываете умеренный $type")
            type.lowercase().startsWith("с") && intensity > 5 ->
                println("Вы испытываете сильный $type")
            intensity < 0 -> println("Вы Эммо")
            intensity > 10 -> println("накротики зло")
        }
    }
}
