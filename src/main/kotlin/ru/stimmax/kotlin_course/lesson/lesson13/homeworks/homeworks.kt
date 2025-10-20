package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson13.homeworks

fun main() {

    // Дан словарь с именем и временем выполнения каждого
    // автоматизированного теста в секундах. Определите среднее время выполнения теста.

    val a= mapOf("LoginTest" to 4.8, "AddToCartTest" to 7.2, "CheckoutTest" to 10.5)
    println(a.values.average())

    // Имеется словарь с метаданными автоматизированных тестов,
    // где ключи — это имена тестовых методов а значения - строка с метаданными.
    // Выведите список всех тестовых методов.

    val a2 = mapOf(
        "testLogin" to "Автор: Иванов; Приоритет: Высокий; Категория: UI",
        "testAddToCart" to "Автор: Петров; Приоритет: Средний; Категория: Smoke",
        "testCheckout" to "Автор: Сидоров; Приоритет: Низкий; Категория: Regression"
    )
    println(a2.keys.toList())

    // В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат

    val a3 = mutableMapOf<String, String>()
    a3["regress"] = "manual"

    // Посчитайте количество успешных тестов в словаре с результатами
    // (ключ - название, значение - результат из passed, failed, skipped).

    val a4 = mutableMapOf(
        "loginTest" to "passed",
        "addToCartTest" to "failed",
        "checkoutTest" to "skipped"
    )
    println(a4.values.count { it == "passed"})

    //  Удалите из изменяемого словаря с баг-трекингом запись о баге,
    //  который был исправлен (ключ - название, значение - статус исправления).
    a4.remove("loginTest")
    println(a4)

    // Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа),
    // выведите сообщение о странице и статусе её проверки

    val a5 = mapOf(
        "/home" to "200 OK",
        "/login" to "404 Not Found",
        "/checkout" to "500 Internal Server Error"
    )

    a5.forEach {
        println("${it.key} статус ${it.value}")
    }

    // Найдите в словаре с названием и временем ответа сервисов только те,
    // время ответа которых превышает заданный порог.

    val a6 = mapOf(
        "AuthService" to 0.35,
        "PaymentService" to 1.2,
        "CatalogService" to 0.8
    )

    println(a6.values.filter { it > 1.0 })

    // В словаре хранятся результаты тестирования API (ключ — endpoint,
    // значение — статус ответа в виде строки). Для указанного endpoint
    // найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.

    val a7 = mapOf(
        "/api/login" to "200 OK",
        "/api/addToCart" to "404 Not Found",
        "/api/checkout" to "500 Server Error"
    )

    println(
        a7.getOrElse("/api/payment") {
            println("не был протестирован")
        })

    // Из словаря, содержащего конфигурации тестового окружения
    // (ключ — название параметра конфигурации, значение - сама конфигурация),
    // получите значение для "browserType". Ответ не может быть null.

    val a8 = mapOf(
        "browserType" to "Chrome 117",
        "os" to "Windows 11",
        "db" to "PostgreSQL 15",
        "baseUrl" to "https://test.example.com"
    )

    println(a8.filter { it.key == "browserType" })

    // Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, добавив новую версию.

    val a9 = mapOf(
        "Auth" to "1.2.3",
        "Payment" to "2.0.1",
        "Catalog" to "3.5.0"
    )
    val a99 = a9 + mapOf("Promo" to "1.57.0")

    // Используя словарь с настройками тестирования для различных мобильных устройств
    // (ключ — модель устройства, значение - строка с настройками),
    // получите настройки для конкретной модели или верните настройки по умолчанию.

    val b1 = mapOf(
        "iPhone 14" to "iOS 17, разрешение 1170x2532",
        "Samsung Galaxy S23" to "Android 13, разрешение 2340x1080",
        "Pixel 8" to "Android 14, разрешение 2400x1080"
    )
    println(b1.getOrDefault("Pixel 9","настройки по умолчанию"))

    // Проверьте, содержит ли словарь с ошибками тестирования
    //(ключ - код ошибки, значение - описание ошибки) определенный код ошибки.

    val b2 = mapOf(
        "E1" to "Auth failed",
        "E2" to "Add to cart failed",
        "E3" to "Checkout error"
    )

    println(b2.contains("E4"))

    // Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев
    // в формате "TestID_Version", а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped").
    // Отфильтруйте словарь, оставив только те сценарии,
    // идентификаторы которых соответствуют определённой версии тестов, то-есть в ключе содержится требуемая версия.

    val b3= mapOf(
        "T001_v1" to "Passed",
        "T002_v2" to "Failed",
        "T003_v1" to "Skipped",
        "T004_v3" to "Passed"
    )

     println(b3.filter { it.key.contains("v1") })

    // У вас есть словарь, где ключи — это названия функциональных модулей приложения,
    // а значения — результаты их тестирования. Проверьте, есть ли модули с неудачным тестированием.

    val b4 = mapOf(
        "LoginModule" to "Passed",
        "CartModule" to "Failed",
        "CheckoutModule" to "Passed",
        "ProfileModule" to "Skipped"
    )

    println(b4.any() { it.value == "Failed" })

    // Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.

    val b5 = mutableMapOf(
        "browser" to "Chrome",
        "os" to "Windows 11",
        "db" to "PostgreSQL 15",
        "baseUrl" to "https://test.example.com"
    )
    b5.putAll(mapOf("db1" to "PostgreSQL 16"))
    println(b5)

    // Объедините два неизменяемых словаря с данными о багах.

    val b6 = b2 + b3
    println(b6)

    // Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.

    b6.toMutableMap().clear ()

    // Исключите из отчета по автоматизированному тестированию те случаи,
    // где тесты были пропущены (имеют статус “skipped”). Ключи - название теста, значения - статус.

    val b7 = mapOf(
        "LoginModule" to "Passed",
        "CartModule" to "Failed",
        "CheckoutModule" to "Passed",
        "ProfileModule" to "Skipped"
    )

    println(b7.filter { it.value != "Skipped" })


    // Создайте копию словаря с конфигурациями тестирования удалив из него несколько конфигураций.
    val b77 = b7 - listOf("LoginModule", "ProfileModule")

    // Создайте отчет о тестировании, преобразовав словарь с результатами тестирования
    // (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".

    val b8 = mapOf(
        "T001" to "Passed",
        "T002" to "Failed",
        "T003" to "Skipped",
        "T004" to "Passed"
    )
    val b88 = b8.map { (k,v) -> "$k : $v" }
    println(b88)

    // Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.

    b6.toMap()

    // Преобразуйте словарь, содержащий числовой ID теста и данные о времени выполнения тестов,
    // заменив идентификаторы тестов на их строковый аналог (например через toString()).

    val b9 = mapOf(
        101 to 4.5,
        102 to 7.2,
        103 to 5.8
    )

    val b99 = b9.mapKeys { it.key.toString() }


    // Для словаря с оценками производительности различных версий приложения (ключи - строковая версия,
    // значения - дробное число времени ответа сервера) увеличьте каждую оценку на 10%,
    // чтобы учесть новые условия тестирования.

    val b10 = mapOf(
        "test_1" to 2.35,
        "test_2" to 4.12,
        "test_3" to 3.87
    )

    val vb101 = b10.mapValues { it.value * 1.1 }

    // Проверьте, пуст ли словарь с ошибками компиляции тестов.

    val c = mapOf(
        "v1.0" to "ok",
        "v1.1" to "fail",
        "v1.2" to "warning"
    )
    println(c.isEmpty())

    // Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.

    println(c.isNotEmpty())

    // Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.

    println(c.all { it.value == "ok" })

    // Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.

    println(c.any { it.value == "fail" })

    // Отфильтруйте словарь с результатами тестирования сервисов,
    // оставив только те тесты, которые не прошли успешно и содержат в названии “optional”.

    val c1 = mapOf(
        "v1.0" to "fail",
        "v1.1_optional" to "fail",
        "v1.2" to "warning"
    )

    val c11 = c1.filterValues { it == "fail" }
        .filterKeys {
            it.contains("optional")
        }
    println(c11)




}