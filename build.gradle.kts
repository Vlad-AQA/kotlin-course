plugins {
    kotlin("jvm") version "2.2.0"
}

group = "ru.stimmax"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.code.gson:gson:2.10.1") // Убедитесь, что версия актуальная
    testImplementation(kotlin("test"))
    // Добавление зависимости JUnit Jupiter API для написания тестов
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.0")
    // Добавление движка JUnit Jupiter для запуска тестов
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.0")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}


