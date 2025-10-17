plugins {
    kotlin("jvm") version "2.2.10"
}

group = "io.github.daegwon"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.github.oshai:kotlin-logging-jvm:7.0.3")
    implementation("ch.qos.logback:logback-classic:1.5.6")
    implementation(kotlin("test"))
    testImplementation(kotlin("test"))
    testImplementation("org.junit.platform:junit-platform-launcher")
    testImplementation("org.junit.platform:junit-platform-engine")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}