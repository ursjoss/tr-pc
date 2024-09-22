plugins {
    java
    application
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

application {
    mainClass = "org.netbeans.core.startup.Main"
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

    tasks.register<JavaExec>("runNetBeans") {
        classpath = sourceSets["main"].runtimeClasspath
        mainClass.set("org.netbeans.core.startup.Main")
        args("--branding", project.name)
	jvmArgs = listOf(
            "-ea",
//            "--add-modules java.xml.bind",
	    "-Xms128m", "-Xmx512m",
	    "-Dorg.netbeans.ProxyClassLoader.level=1000",
            "--add-opens=java.base/java.lang.reflect=ALL-UNNAMED",
            "--add-opens=java.base/java.lang=ALL-UNNAMED",
            "--add-opens=java.base/java.net=ALL-UNNAMED",
            "--add-opens=java.base/java.security=ALL-UNNAMED",
            "--add-opens=java.base/java.text=ALL-UNNAMED",
            "--add-opens=java.base/java.util=ALL-UNNAMED",
            "--add-opens=java.desktop/java.awt.font=ALL-UNNAMED",
            "--add-opens=java.desktop/javax.swing=ALL-UNNAMED",
            "--add-opens=java.desktop/sun.awt=ALL-UNNAMED",
        )
	systemProperty("netbeans.logger.console", "true")
	systemProperty("java.security.manager", "allow")
    }

    tasks.named<Test>("test") {
        useJUnitPlatform()
    }
}

