package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson17.homeworks

abstract class BaseClass(
    // 1. объясни, почему это поле доступно в main() для чтения из класса ChildrenClass
    // абстрактный класс доступен для чтения не доступен для создания обьектов
    private val privateVal: String,
    // 2. объясни, почему это поле недоступно в main()
    // приватное поле доступно только внутри класса
    protected val protectedVal: String,
    val publicVal: String
) {
    var publicField = "3. измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
            "4. Доработай ChildrenClass таким образом, чтобы это получилось"
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }
    protected var protectedField = "поле не OPEN!!!! 5. измени меня из функции main() через сеттер в наследнике"
    private var privateField = "6. добавь сеттер чтобы изменить меня из main()"
    open fun setPrivateField(value: String): String {
        privateField = value
        return privateField
    }

    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
            "generate" to generate(),
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }

    fun printText() {
        privatePrint()
    }

    // 7. объясни, почему эта функция не может быть публичной
    protected open fun getProtectedClass() = ProtectedClass()
    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }

    // 8. Распечатай getAll() и объясни, почему в поле "generate" другой текст
    // в наследнике перегрузили этот метод
    open fun generate(): String {
        return "Это генерация из родительского класса"
    }

    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }

    // 9. объясни, почему эта функция не может быть публичной или protected
    // private class PrivateClass() как бы
    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass()

    private class PrivateClass()
}

class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    // 10. объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
    // доступен через наследника потому что протектед
    publicVal: String
) : BaseClass(privateVal, protectedVal, privateVal) {
    // 11. объясни, почему в main() доступна функция getAll() хотя её здесь нет
    // доступна потому что мы наследники
    // 12. проверь, что выводится на печать при вызове функции printText()
    // и объясни, почему не происходит переопределение метода privatePrint()
    // потому что нужно перегружать метод принтехт
    override fun verifyPublicField(value: String): Boolean {
        return value.length > 3
    }

    /* override var protectedField: String
         get() = super.protectedField
         set(value) {
             super.protectedField = value
         } */


    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }

    override fun generate(): String {
        return "Это генерация из дочернего класса"
    }
}

fun main() {
    val childrenClass = ChildrenClass("1", "2", "1")
    childrenClass.printText()
    println(childrenClass.getAll())
    childrenClass.publicField = "Антонио Бандераса"
    println(childrenClass.getAll())
    childrenClass.setPrivateField("Жора")
    println(childrenClass.getAll())
}