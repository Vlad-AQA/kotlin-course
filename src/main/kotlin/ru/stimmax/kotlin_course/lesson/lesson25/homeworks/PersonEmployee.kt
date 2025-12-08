package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson25.homeworks

data class Person(val name: String, val age: Int) {
    var email: String = ""
}

data class Employee(val name: String, val age: Int, val position: String) {
    var email: String = ""
    var department: String = "General"
}

fun main() {

//    Использование apply для инициализации объекта Employee
//    Создайте объект Employee и используйте apply для инициализации его полей email и department.

    val employee = Employee("Володя", 19, "разработчик").apply {
        email = "vova@ova.ru"
        department = "Digital"
    }
    println(employee.email)

//    Создайте объект Person и используйте also для добавления почты и печати данных в консоль
//    с помощью метода который только что создали.

    val person = Person("Аркадий", 102).also { person ->
        person.email = "arkasha@arc.ru"
        personWithAlso(person)
    }

    println(person)


    // Использование with для преобразование Person в Employee
    //Создайте объект класса Person. Используйте функцию with,
    // чтобы создать из этого объекта Employee, указав дополнительно должность.
    // Возвращаемым значением должен быть новый объект Employee.

    val person1 = Person("Паша", 43)
    val employee1 = with(person1) {
        Employee(name, age, "QA")

    }
    println(employee1)

    // Использование run для преобразования и инициализации Employee
    //Перепиши предыдущую задачу на использование run вместо with.

    val employee2 = person1.run {
        Employee(name, age, "AQA")
    }
    println(employee2)


    //Использование let для безопасного преобразования Person в Employee
    //Создайте функцию toEmployee, которая расширяет класс Person,
    // который может быть null. В функции используйте функцию let для создания Employee,
    // только если объект Person не null. В противном случае возвращается null

    fun Person?.toEmployee(): Employee? {
        return this?.let {
            Employee(name, age, "AQA")
        }
    }
}


//    Использование also для логирования
//    Создайте функцию, принимающую объект Person и выводящую информацию об объекте в консоль в красивом,
//    отформатированном виде. Используй with для создания контекста Person
//    и возможности использовать поля объекта напрямую без обращения к переменной.

fun personWithAlso(person: Person) {
    with(person) {
        println("Имя - $name")
        println("Возраст - $age")
        println("Почта - $email")
    }
}