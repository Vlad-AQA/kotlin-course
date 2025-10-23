package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson14.homeworks


// Природное явление: луна. Создайте объект Moon, который будет представлять Луну.
// Добавьте свойства isVisible (Boolean), чтобы отображать,
// видна ли Луна в данный момент, и phase (String),
// чтобы отображать текущую фазу Луны (например, "Full Moon", "New Moon").
// Добавьте метод showPhase(), который выводит текущую фазу Луны.
object Moon {
    var isVisible = true
    var phase = "New Moon"
    fun showPhase() {
        if (isVisible) {
            println("текущая фаза Луны $phase")
        } else {
            println("Луну не видно")
        }
    }
}