description = "TR-Application"

plugins {
    id("java-library")
    application
}

dependencies {
    api(libs.netbeans.api.modules.options.api)

    implementation(libs.miglayout.swing)

    runtimeOnly(libs.netbeans.modules.projectapi.nb)
    runtimeOnly(libs.netbeans.modules.core.multitabs.project)
    runtimeOnly(libs.netbeans.modules.core.windows)
}

tasks.register<JavaExec>("runNetBeans") {
    classpath = sourceSets["main"].runtimeClasspath
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
    )
    systemProperty("netbeans.logger.console", "true")
    systemProperty("java.security.manager", "allow")
}
