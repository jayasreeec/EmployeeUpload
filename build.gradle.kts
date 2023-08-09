plugins {
    id("java")
}

group = "org.EmployeeDatabase"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.xerial:sqlite-jdbc:3.42.0.0")
    implementation("net.sf.opencsv:opencsv:2.3")
    implementation("org.apache.commons:commons-lang3:3.13.0")
}

tasks.test {
    useJUnitPlatform()
}