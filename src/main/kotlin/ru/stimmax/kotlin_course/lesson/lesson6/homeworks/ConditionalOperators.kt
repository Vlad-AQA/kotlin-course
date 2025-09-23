package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson6.homeworks

import ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson4.a
import ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson4.e
import ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson6.ex2

fun main() {
    ex1(8)
    ex4(24.0)
    ex5(29)
    ex6(3553)
    ex7("doc")
    ex8(800, 'F')
    ex9(19)
    ex10(19)
}
//Задание 1: "Определение сезона"
//Напишите функцию, которая на основе номера месяца распечатывает сезон года.
// Номера месяцев начинаются с единицы.
fun ex1(month: Int) {
    when (month) {
        in listOf<Int>(12, 1, 2) -> println("winter")
        in listOf<Int>(3, 4, 5) -> println("spring")
        in listOf<Int>(6, 7, 8) -> println("summer")
        in listOf<Int>(9, 10, 11) -> println("autumn")
    }
}
//Задание 2: "Расчет возраста питомца"
//Создайте функцию, которая преобразует возраст собаки в "человеческие" годы.
// До 2 лет каждый год собаки равен 10.5 человеческим годам, после
// - каждый год равен 4 человеческим годам. Результат распечатай в консоль.
fun ex4(dogAge: Double) {
    if (dogAge > 0 && dogAge <= 2) {
       println(dogAge * 10.5)
    }  else if (dogAge > 2) {
        println(dogAge * 4)
    } else {
        println("incorrect age")
    }
}

//Задание 3: "Определение способа перемещения"
//
//Напишите функцию, которая печатает в консоль,
// какой способ перемещения лучше использовать,
// исходя из длины маршрута.
// Если маршрут до 1 км - "пешком", до 5 км - "велосипед", иначе - "автотранспорт".

fun ex5(pathLength: Int) {
    if (pathLength <= 1) {
        println("пешком")
    } else if (pathLength <= 5) {
        println("велосипед")
    } else {
        println("автотранспорт")
    }
}
//Задание 4: "Расчет бонусных баллов"
//
//Клиенты интернет-магазина получают бонусные баллы за покупки.
// Напишите функцию, которая принимает сумму покупки и печатает
// в консоль количество бонусных баллов: 2 балла за каждые 100 рублей
// при сумме покупки до 1000 рублей и 3 балла за каждые 100 рублей при
// сумме свыше этого.

fun ex6(purchaseAmount: Int) {
    if (purchaseAmount in 0..1000) {
        println(purchaseAmount / 100 * 2)
    } else {
        println(purchaseAmount / 100 * 3)
    }
}
//Задание 5: "Определение типа документа"
//В системе хранения документов каждый файл имеет расширение.
// Напишите функцию, которая на основе расширения файла печатает
// в консоль его тип: "Текстовый документ", "Изображение", "Таблица"
// или "Неизвестный тип".
fun ex7(extension: String) {
    if (extension in listOf<String>("doc", "pdf", "word", "txt")) {
        println("Текстовый документ")
    } else if (extension in listOf<String>("jpg", "png", "gif", "bmp", "tiff")) {
        println("Изображение")
    } else if (extension in listOf<String>("xls", "xlsx", "ods", "csv", "tsv")) {
        println("Таблица")
    } else {
        println("Неизвестный тип")
    }
}
// Задание 6: "Конвертация температуры"
//Создайте функцию, которая конвертирует температуру из градусов Цельсия
// в Фаренгейты и наоборот в зависимости от указанной единицы измерения (C/F).
// Единицу измерения нужно передать вторым аргументом функции.
// Несколько аргументов передаются через запятую. Распечатай в консоль
// результат конвертации с добавлением единицы измерения. Чтобы добавить единицу
// измерения после результата используй функцию печати без переноса строки print("C") или print("F").
fun ex8(meaningTemperature: Int, unitsMeasurement: Char) {
    var temperature: Int = 0
    if (unitsMeasurement == 'C') {
        temperature = meaningTemperature * 9/5 + 32
        print(temperature)
        println(" F")
    } else if (unitsMeasurement == 'F') {
        temperature = (meaningTemperature - 32) * 5/9
        print(temperature)
        println(" C")
    }
}
//Задание 7: "Подбор одежды по погоде"
//Напишите функцию, которая на основе температуры воздуха рекомендует
// тип одежды: "куртка и шапка" при температуре ниже +10, "ветровка"
// от +10 до +18 градусов включительно и "футболка и шорты" при температуре
// выше +18 градусов. При температурах ниже -30 и выше +35 рекомендуйте не
// выходить из дома.
fun ex9(airTemperature: Int) {
    if (airTemperature < -30 || airTemperature > 35) {
        println("рекомендуем не выходить из дома")
    } else if (airTemperature < 10) {
        println("куртка и шапка")
    } else if (airTemperature in 10..18) {
        println("ветровка")
    } else {
        println("футболка и шорты")
    }
}
//  "Выбор фильма по возрасту"
//Кинотеатр предлагает фильмы разных возрастных категорий.
// Напишите функцию, которая принимает возраст зрителя и возвращает
// доступные для него категории фильмов: "детские" (от 0 до 9),
// "подростковые" (от 10 до 18), "18+" для остальных.
fun ex10(ageViewer: Int) {
    if (ageViewer in 0..9) {
        println("детские")
    } else if (ageViewer in 10..18) {
        println("подростковые")
    } else {
        println("18+")
    }
}