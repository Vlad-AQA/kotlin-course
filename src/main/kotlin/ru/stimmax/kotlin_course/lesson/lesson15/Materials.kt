package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson15

abstract class Materials {

    private val materials = mutableListOf<String>()

    fun addMaterial(material: String) {
        materials.add(material)
    }

    fun extractMaterials(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
}
fun main() {
    val ordinalNumbers = listOf(
        "first", "second", "third", "fourth", "fifth",
        "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
        "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
    )


    val materials1 = Materials1()
    ordinalNumbers.forEach { materials1.addMaterial(it)}
    println(materials1.extractFirst())
    println(materials1.extractFirst())
    println(materials1.extractFirst())
    println(materials1.printContainer())
    val materials2 = Materials2()














}