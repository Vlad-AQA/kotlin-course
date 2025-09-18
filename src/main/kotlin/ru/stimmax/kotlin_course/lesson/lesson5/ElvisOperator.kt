package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson5

fun main() {

//Задача 1
//Контекст: Вы изучаете физическое явление затухания звука в помещении.
// У вас есть измеренное значение начальной интенсивности звука,
// но из-за ограничений оборудования данные о коэффициенте затухания иногда могут быть неизвестны.
//Задача: Рассчитать предполагаемую интенсивность звука после затухания.
// Интенсивность звука после затухания пропорциональна начальной интенсивности,
// умноженной на коэффициент затухания. Если коэффициент затухания неизвестен,
// использовать стандартное значение 0.5.
    val baseSoundIntensity: Double = 3.0
    val attenuationCoefficient: Double ? = 0.73
    val baseCoefficient: Double = 0.5
    val resultIntensity: Double = baseSoundIntensity * (attenuationCoefficient ?: baseCoefficient)

//Задача 2
//Контекст: Клиент оплачивает доставку груза.
// К стоимости доставки добавляется страховка на груз,
// которая составляет 0,5% от его стоимости. В случае, если стоимость не указана,
// то берётся стандартная стоимость в $50
//Задача: Рассчитать полную стоимость доставки.
    val deliveryPrice: Double ? = null
    val standardDeliveryCost: Double = 50.0
    val cargoInsurance: Double = (deliveryPrice ?: standardDeliveryCost) * 0.005
    val totalDeliveryCost:Double = (deliveryPrice ?: standardDeliveryCost) + cargoInsurance

//Задача 3
//
//Контекст: Вы проводите метеорологические измерения.
// Одним из важных показателей является атмосферное давление,
// которое должно быть зафиксировано. Лаборант приносит вам набор показателей,
// но по пути может что-нибудь потерять.
// Задача - сообщить об ошибке в случае отсутствия показаний атмосферного давления.

    val atmosphericPressure: Double? = 755.00
    val errorMessage = "Произошла ошибка при расчёте"
    val pressureForLab:Any = atmosphericPressure ?: errorMessage

}















