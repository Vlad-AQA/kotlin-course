package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson13

fun main() {

    val fruitsPrices = mapOf("apple" to 2.99, "banana" to 1.99, "cherry" to 3.99)


    // Когда вы итерируете словарь, каждый элемент, с которым вы работаете в цикле,
    // является объектом Map.Entry Вот как можно получить доступ к ключам и значениям:

    for (entry in fruitsPrices.entries) {
        println("Key: ${entry.key}, Value: ${entry.value}")
    }

    // Альтернативно, можно использовать деструктуризацию для получения ключа и значения напрямую:

    for ((key, value) in fruitsPrices) {
        println("Key: $key, Value: $value")
    }


    // Получение Элементов
    // entries, keys, values

    val entries = fruitsPrices.entries
    val keys = fruitsPrices.keys
    val values = fruitsPrices.values
    println(entries)
    println(keys)
    println(values)


    // методы получения элементов из словаря
    // getOrElse, getValue, getOrDefault

    val priceOfPearOrElse = fruitsPrices.getOrElse("pear") { 9999.99 }
    val priceOfApple = fruitsPrices.getValue("apple")
    val priceOfPearOrDefault = fruitsPrices.getOrDefault("pear", 0.0)


    // Изменение состава словаря

    val fruitsWithoutBanana = fruitsPrices - listOf("banana", "apple") // создание нового словаря в котором нет "banana"
    val fruitsWithPineapple = fruitsPrices + ("pineapple" to 3.5) // создание нового словаря с дополнительной парой
    val mutableFruits = fruitsPrices.toMutableMap() // Создание нового изменяемого словаря с теми же значениями
    mutableFruits["kiwi"] = 2.75 // Добавление элемента
    mutableFruits.putAll(mapOf("lime" to 1.1, "avocado" to 1.9)) // Добавление словаря
    mutableFruits + mapOf(
        "lime" to 1.1,
        "avocado" to 1.9
    ) // Не добавляет данные в существующий словарь а создаёт новый,
    // в который включены данные из обоих словарей

    mutableFruits.remove("apple") // Удаление элемента
    mutableFruits.clear() // Очистка словаря

    // Проверка наличия элементов
    // containsKey, containsValue, isEmpty, isNotEmpty

    val containsApple = fruitsPrices.containsKey("apple")
    val containsValue1_5 = fruitsPrices.containsValue(1.5)
    val isEmpty = fruitsPrices.isEmpty()
    val isNotEmpty = fruitsPrices.isNotEmpty()
    val areAllFruitsExpensive = fruitsPrices.all { it.value > 1.0 }
    val isAnyFruitCheap = fruitsPrices.any { it.value < 1.0 }


    // Фильтрация и преобразование
    // filter, filterKeys, filterValues, filterNot, count

    val filteredByPrice = fruitsPrices.filter { it.value > 1.0 }
    val filteredByKeys = fruitsPrices.filterKeys { it.startsWith("a") }
    val filteredByValues = fruitsPrices.filterValues { it < 2.0 }
    val filteredNotApple = fruitsPrices.filterNot { it.key == "apple" }
    val countExpensiveFruits = fruitsPrices.count { it.value > 1.5 }

    // Преобразования map, mapKeys, mapValues

    val increasedPrices = fruitsPrices.mapValues { it.value * 1.1 }
    val fruitNamesUppercase = fruitsPrices.mapKeys { it.key.uppercase() }
    val fruitsList = fruitsPrices.map { "${it.key} costs ${it.value}" }

    // Преобразование в Map и MutableMap

    //  val toMap = mutableFruitsPrices.toMap
    val toMutableMap = fruitsPrices.toMutableMap()

    // Итерация с forEach
    // С использованием деструктуризации

    fruitsPrices.forEach { (fruit, price) ->
        println("$fruit costs $price")
    }
    // С использованием it как объекта Map.Entry

    fruitsPrices.forEach {
        println("${it.key} costs ${it.value}")
    }

    // Размер словаря
    // size и count

    fruitsPrices.size // количество ключей
    fruitsPrices.count() // тоже количество ключей
    fruitsPrices.count { it.value > 2 } // количество ключей если сначала применить фильтрацию по условию

    // Для практики будем использовать словарь продуктов:

    val food = mapOf(
        "Овощи" to listOf("Картофель", "Морковь", "Лук"),
        "Фрукты" to listOf("Яблоки", "Груши", "Апельсины"),
        "Ягоды" to listOf("Виноград", "Клубника", "Голубика"),
        "Орехи" to listOf("Арахис", "Фундук", "Макадамия"),
        "Зелень" to listOf()
    )

    // Создай переменную без указания типа и присвой ей значение
    // по ключу "Овощи". Объясни какой тип переменной должен быть.

    val a1: List<String>? = food["Овощи"]

    // Выведи данные в виде "Ключ: Значение1, Значение2"
    // используя цикл for а потом функцию forEach.

    for ((k,v) in food) {
        println("Key: $k, Value: $v")
    }

    food.forEach { println("${it.key} ${it.value}")}

    // Создай not nullable переменную типа List<String>
    // и присвой ей значение по ключу "Фрукты".

    val a2: List<String> = food.getValue("Фрукты")

    // Создай not nullable переменную типа List<String>
    // и присвой ей значение по ключу "Крупы".
    // Используй в качестве значения по умолчанию пустой список,
    // если ключа нет.

    val a3: List<String> = food.getOrDefault("Крупы", listOf())


    // Создай not nullable переменную типа List<String>
    // и присвой ей значение по ключу "Рыба".
    // Если ключа нет, нужно вывести в консоль сообщение
    // об отсутствии ключа и присвоить переменной пустой список.

    val a4: List<String> = food.getOrElse("Рыба") {
        println("сообщение об отсутствии ключа")
        listOf()
    }

    // Выведи сообщение "Продукты для вегетарианца" если
    // в словаре нет ключей "Мясо" и "Рыба"

    if (!food.contains("Мясо") && !food.contains("Рыба")) {
        println("Продукты для вегетарианца")
    }

    // Преобразуй словарь в список строк типа
    // "Ключ: [значение1, значение2]"

    val a5 = food.map() {
        "{$it.key: $it.value}"
    }


}