package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson26

import java.io.File

fun main() {
    val file = File("path/to/your/file.txt")
    val dir = File("path/to/your/directory")
    if (file.exists()) {
        println("Файл существует")
    } else {
        println("Файл не найден")
    }


//    val isNewFileCreated: Boolean = file.createNewFile()
//    if (isNewFileCreated) {
//        println("Файл был создан")
//    } else {
//        println("Файл уже существует")
//    }

    file.parentFile.mkdirs()
    file.createNewFile()

    file.writeText("Hello, world!")

    val text = file.readText()
    println(text)

    val isDirectoryCreated: Boolean = dir.mkdir()
    if (isDirectoryCreated) {
        println("Директория была создана")
    } else {
        println("Не удалось создать директорию")
    }

//    Получение списка файлов в директории:
    val files = dir.listFiles()
    files?.forEach { file ->
        println(file.name)
    }

//    Удаление файла или директории
    if (file.delete()) {
        println("Файл удален")
    } else {
        println("Не удалось удалить файл")
    }


//    Удаление директории возможно только, если она пуста.
//    Для удаления непустой директории со всеми файлами и поддиректориями можно использовать следующий метод:

    if (file.deleteRecursively()) {
        println("Директория и всё её содержимое удалено")
    } else {
        println("Не удалось удалить директорию")
    }


//    copyTo
//    Копирует файл в указанное местоположение.
//    Пример:

    val sourceFile = File("/path/to/source.txt")
    val destinationFile = File("/path/to/destination.txt")
    sourceFile.copyTo(destinationFile, overwrite = true) // Копирует файл, перезаписывая его при необходимости


//    toRelativeString
//    Возвращает относительный путь от одного File к другому.
//    Пример:

    val baseDir = File("/path/to")
    val file1 = File("/path/to/nested/file.txt")
    println(file1.toRelativeString(baseDir)) // Вывод: nested/file.txt


//    walk
//    Выполняет рекурсивный перебор всех файлов директории,
//    предоставляя их как поток, с которым можно работать как с обычными списками

    val file2 = File("path/to/file")
    file2.walk().filter { it.isFile }
        .associate { it.name to it.readLines() }
        .filterValues { data ->
            data.any { it.contains("text") }
        }

}

fun searchFilesUsingWalk(startDir: String, query: String): List<String> {
    return File(startDir)
        .walk() // Рекурсивный обход файлов и директорий начиная с startDir
        .filter { it.isFile && it.name.contains(query, ignoreCase = true) } // Фильтрация по имени файла
        .map { it.absolutePath } // Преобразование результатов в абсолютные пути
        .toList() // Сбор результатов в список
}
