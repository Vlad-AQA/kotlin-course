package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson15.homeworks

import kotlin.math.PI
import kotlin.math.sqrt
import kotlin.math.sin

abstract class GeometricShapes(
    val name: String,
    val is3D: String

) {
    abstract fun square(): Double

}
open class Polygon(
     name: String,
     is3D: String,
     val numberAngles: Int
): GeometricShapes(name , is3D) {
    override fun square(): Double {
        return 0.0
    }
}

class Circle(
    name: String,
    is3D: String,
    val radius: Double,
    val diameter: Double
): GeometricShapes(name , is3D) {

    override fun square(): Double {
        val s2 = (PI * diameter * diameter) / 2
        return s2
    }

}
open class Triangle(
    name: String,
    is3D: String,
    val sideA: Double,
    val sideB: Double,
    val sideC: Double,
    val cornerA: Double,
    val cornerB: Double,
    val cornerC: Double
): Polygon(name , is3D, numberAngles = 3) {
    override fun square(): Double {
        val p = (sideA + sideB + sideC) / 2
        val s2 = sqrt((p *(p - sideA)*(p - sideB)*(p - sideC)))
        return s2
    }
}

open class Quadrangle(
    name: String,
    is3D: String,
    val sideA: Double,
    val sideB: Double,
    val sideC: Double,
    val sidD: Double,
    val d1: Double,
    val d2: Double,
    val cornerA: Double,
    val cornerB: Double,
    val cornerC: Double,
    val cornerD: Double
): Polygon(name , is3D, numberAngles = 4) {
    override fun square(): Double {
        val s2 = 0.5 * d1 * d1 * sin(cornerA)
        return s2
    }

}