plugins {
    java
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

subprojects {
    apply(plugin = "java")

    repositories {
        mavenCentral()

        maven {
            url = uri("https://netbeans.apidesign.org/maven2")
        }
    }

    dependencies {
        testImplementation(rootProject.libs.junit.jupiter)
        testImplementation(rootProject.libs.junit4)
        testRuntimeOnly(rootProject.libs.junit.vintage.engine)
    }

    tasks.named<Test>("test") {
        useJUnitPlatform()
    }
}

