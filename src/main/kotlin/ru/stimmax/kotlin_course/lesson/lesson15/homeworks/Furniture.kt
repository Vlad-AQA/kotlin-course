package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson15.homeworks

abstract class Furniture {
    val materials = mutableListOf<String>()

    fun addMaterial(material: String) {
        materials.add(material)
    }

    fun getMaterials(): List<String> {
        return materials
    }
}

class BottomInsertFurniture : Furniture() {
    fun addMaterialToBottom(material: String) {
        materials.add(0, material)
    }
}

class AlternatingInsertFurniture : Furniture() {

    fun addMaterialAlternating(material: String) {
        val oldList = materials.toList()
        materials.clear()

        var iOld = 0
        var iNew = 0
        val newMaterials = listOf(material)

        while (iOld < oldList.size || iNew < newMaterials.size) {
            if (iNew < newMaterials.size) {
                materials.add(newMaterials[iNew])
                iNew++
            }
            if (iOld < oldList.size) {
                materials.add(oldList[iOld])
                iOld++
            }
        }
    }
}

class SortedInsertFurniture : Furniture() {

    fun addMaterialSorted(material: String) {
        materials.add(material)
        materials.sort()
    }
}

class KeyValueInsertFurniture : Furniture() {

    fun addMaterialsFromMap(map: Map<String, String>) {
        for (key in map.keys.toList().reversed()) {
            materials.add(0, key)
        }
        for (value in map.values) {
            materials.add(value)
        }
    }
}

