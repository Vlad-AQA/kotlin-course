package ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson26

import java.io.File

fun ex(path: String) {
    val file = File(path)
    if (path.endsWith("/")) {
        file.mkdirs()
    } else {
        file.parentFile?.mkdirs()
        file.createNewFile()
    }
}

fun ex1(path: String, map: Map<String, Double>) {
    with(File(path)) {
        parentFile?.mkdirs()
        createNewFile()
        map.map { "${it.key}=${it.value}" }
            .joinToString("\n")
            .also {
                writeText(it)
            }
    }
}

fun ex3(path: String, str: String) {
    File(path).apply {
        if (exists() && readText().contains(str)) {
            delete()
        }
    }
}

fun ex4(path: String, nameFile: String): List<String> {
    return File(path)
        .walk()
        .filter { it.isFile() && it.name.contains(nameFile) }
        .map { it.readText() }
        .toList()
}


fun String.copyToo(path: String) {
    File(this).run {
        check(exists()) { "Это напоминание тебе как работает CHECK()" }
        mkdirs()
        File(path).parentFile?.mkdirs()
        copyTo(this, true)
    }

}

















