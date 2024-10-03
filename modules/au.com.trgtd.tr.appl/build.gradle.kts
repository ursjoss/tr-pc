description = "TR-Application"

plugins {
    id("java-library")
    application
}


dependencies {
    api(libs.netbeans.api.modules.options.api)

    implementation(libs.miglayout.swing)
}

val netbeansVersion = "22"

tasks.register<JavaExec>("runNetBeans") {
    dependsOn(rootProject.tasks.named("downloadNetBeans"))
    classpath = sourceSets["main"].runtimeClasspath + files("${layout.buildDirectory}/netbeans-platform/platform/lib/boot.jar")
    mainClass.set("org.netbeans.core.startup.Main")
    args("--branding", project.name)
    jvmArgs = listOf(
        "-ea",
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
	"-XX:+HeapDumpOnOutOfMemoryError",
	"-XX:HeapDumpPath=build/userdir/var/log/heapdumup.hprof",
    )
    val userdir = file("${rootProject.layout.buildDirectory.get()}/userdir")
    val netbeansPlatDir = file("${rootProject.layout.projectDirectory}/netbeans-plat/$netbeansVersion/")
    systemProperty("netbeans.user", userdir)
    systemProperty("netbeans.dirs", netbeansPlatDir)
    systemProperty("netbeans.home", netbeansPlatDir.resolve("platform/"))
    systemProperty("netbeans.logger.console", "true")
    systemProperty("java.security.manager", "allow")
}

