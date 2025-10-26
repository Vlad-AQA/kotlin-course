package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson15

class Materials1: Materials() {
    fun extractFirst(): String {
        val materials = extractMaterials()
        materials.drop(1).forEach { addMaterial(it)}
        return materials.first()

        }
    }
