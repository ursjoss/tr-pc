description = "TR-Application"

plugins {
    id("java-library")
}

dependencies {
    api(libs.netbeans.modules.options.api)

    implementation(libs.miglayout.swing)

    runtimeOnly(libs.netbeans.modules.projectapi.nb)
    runtimeOnly(libs.netbeans.modules.core.multitabs.project)
    runtimeOnly(libs.netbeans.modules.core.windows)
}

