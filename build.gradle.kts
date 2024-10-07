plugins {
    id("java")
    id("com.gradleup.shadow") version "8.3.0"
}

group = "me.levitate"
version = "1.0.0"

repositories {
    mavenCentral()

    maven("https://repo.papermc.io/repository/maven-public/")
    maven("https://repo.aikar.co/content/groups/aikar/")
    maven("https://jitpack.io")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.21-R0.1-SNAPSHOT")

    // Lombok
    compileOnly("org.projectlombok:lombok:1.18.32")
    annotationProcessor("org.projectlombok:lombok:1.18.32")

    // Handle storing data in JSON
    implementation("com.squareup.moshi:moshi-adapters:1.15.1")
    implementation("com.github.xLevitate:hive-json:1.1.0")

    // GUI Library
    implementation("dev.triumphteam:triumph-gui:3.1.10")

    // Commands
    implementation("co.aikar:acf-paper:0.5.1-SNAPSHOT")

    // Config
    implementation("de.exlll:configlib-yaml:4.5.0")

    // Other libraries like Quill.
    implementation(fileTree("libs/impl"))
}

tasks.shadowJar {
    minimize()
}