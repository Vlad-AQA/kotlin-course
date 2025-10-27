package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson15.homeworks


abstract class Furniture {
    protected val materials = mutableListOf<String>()

    abstract fun addMaterial(material: String)

    fun getMaterials(): List<String> {
        return materials
    }
}

class BottomInsertFurniture : Furniture() {
    override fun addMaterial(material: String) {
        materials.add(0, material)
    }
}

class AlternatingInsertFurniture : Furniture() {
    override fun addMaterial(material: String) {
        val newList = mutableListOf<String>()
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
    override fun addMaterial(material: String) {
        materials.add(material)
        materials.sort()
    }
}

class KeyValueInsertFurniture : Furniture() {
    fun addMaterials(map: Map<String, String>) {
        // Добавляем ключи в начало в обратном порядке
        for (key in map.keys.toList().reversed()) {
            materials.add(0, key)
        }
        // Добавляем значения в конец
        for (value in map.values) {
            materials.add(value)
        }
    }

    override fun addMaterial(material: String) {
        // Просто добавляем в конец
        materials.add(material)
    }
}
