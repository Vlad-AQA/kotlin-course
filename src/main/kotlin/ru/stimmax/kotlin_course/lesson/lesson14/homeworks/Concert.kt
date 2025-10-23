package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson14.homeworks

// Мероприятие: концерт. Создайте класс, который будет представлять концерт.
// У него должны быть свойства “группа”, “место проведения”, “стоимость”, “вместимость зала”.
// Также приватное поле “проданные билеты”.
// Добавьте метод, который выводит информацию о концерте и метод “купить билет”,
// который увеличивает количество проданных билетов на один.

class Concert(
    val group: String,
    val place: String,
    val price: Double,
    var hallCapacity: Int,
    private var ticketsSold: Int) {

    fun info() {
        println("Группа: $group, место проведения: $place, цена билета: $price, осталось билетов: $hallCapacity")
    }
    fun buyTicket() {
        if (hallCapacity > ticketsSold) {
            ticketsSold++
            hallCapacity--
        }
    }
}