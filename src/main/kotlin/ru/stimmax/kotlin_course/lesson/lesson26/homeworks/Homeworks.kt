package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson26.homeworks

import java.io.File

fun main() {

//    Создайте текстовый файл workspace/task1/example.txt.
//    Запишите в него строку "Hello, Kotlin!", а затем проверьте,
//    существует ли файл. Реши задачу с использованием scope функции без создания переменной.

    File("workspace/task1/example.txt").run {
        writeText("Hello, Kotlin!")
        check(exists()) { "Тут нет файла" }
    }

//    Создайте директорию workspace/task2/testDir.
//    Проверьте, является ли она директорией, и выведите её абсолютный путь.

    File("workspace/task2/testDir").apply {
        mkdirs()
        check(isDirectory) { "Нет такой директории" }
        println(absolutePath)
    }


//    Создайте директорию workspace/task3/structure.
//    Внутри директории structure создайте папку myDir
//    с двумя вложенными поддиректориями subDir1 и subDir2.
//    Проверьте, что myDir действительно содержит эти поддиректории.
//    Используй scope функции для минимизации создания переменных а так же метод
//    file.resolve("myDir") для создания нового объекта File путём добавления к существующему пути
//    ещё одной секции. И так же для других директорий.

    File("workspace/task3/structure").apply {
        mkdirs()
        val myDir = resolve("myDir")
        myDir.mkdirs()
        listOf("subDir1", "subDir2").forEach { name ->
            myDir
                .resolve(name)
                .mkdirs()
        }
        myDir.listFiles().run {
            check(any { it.name == "subDir1" }) { "Не содержит subDir1" }
            check(any { it.name == "subDir2" }) { "Не содержит subDir2" }
        }
    }


//    Создайте директорию workspace/task4/temp.
//    Внутри директории temp создайте несколько вложенных файлов и директорий.
//    Удалите директорию workspace/task4 со всем содержимым

    File("workspace/task4/temp").apply {
        mkdirs()
        listOf(
            Triple("File.txt", "dir", "Тут текст"),
            Triple("File2.txt", "dir2", "Тут текст2"),
            Triple("File3.txt", "dir3", "Тут текст3"),
        ).forEach { (file, dirName, text) ->
            val dir = resolve(dirName).apply { mkdirs() }
            dir.resolve(file).apply { writeText(text) }
        }
        parentFile.deleteRecursively()
    }

//    Создайте файл workspace/task5/config/config.txt.
//    запишите в него список параметров (в формате ключ=значение),
//    а затем прочитайте файл и выведите только значения.

    File("workspace/task5/config/config.txt").apply {
        listOf(
            "ключ" to "значение",
            "ключ2" to "значение2",
            "ключ3" to "значение3"
        ).joinToString("\n") { (key, value) ->
            "$key=$value"
        }.also { writeText(it) }
        readLines()
            .map { it.split("=").getOrNull(1) }
            .forEach { println(it) }
    }

    // Пройди по всем вложенным директориям workspace
    // и выведи в консоль сначала пути директорий, а потом пути файлов

    File("workspace").apply {
        walk()
            .filter { it.isDirectory }
            .forEach { println(it.path) }
        walk()
            .filter { it.isFile }
            .forEach { println(it.path) }
    }


//    Создайте директорию workspace/task7/docs.
//    Проверь, есть ли файл с именем readme.md.
//    Если файла нет, создайте его и запишите текст "This is a README file.".
//    Проверьте текст в файле.

    File("workspace/task7/docs").apply {
        mkdirs()
        val readme = resolve("readme.md")
        if (!readme.exists()) {
            readme.writeText("This is a README file.")
        }
        println(readme.readLines())

    }


}