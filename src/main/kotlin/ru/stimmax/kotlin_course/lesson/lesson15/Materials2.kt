package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson15

class Materials2: Materials() {
    fun extractMiddle(): String {
        val materials = extractMaterials()
        val index = materials.size / 2
        for (i in materials.indices) {
            if (i == index) continue
            addMaterial(materials[index])
        }
    return materials[index]
    }
}