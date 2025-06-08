plugins {
    id("com.github.ben-manes.versions") version "0.51.0" // Актуальная версия на май 2025
    id("application")
    id("org.sonarqube") version "6.2.0.5505"
    checkstyle
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass = "hexlet.code.App"
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

sonar {
    properties {
        property("sonar.projectKey", "valentin-osadchii_java-project-61")
        property("sonar.organization", "valentin-osadchii")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}