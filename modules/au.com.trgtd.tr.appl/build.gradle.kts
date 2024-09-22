description = "TR-Application"

plugins {
    id("java-library")
}

dependencies {
    api(libs.netbeans.modules.options.api)

    implementation(libs.netbeans.openide.windows)
    implementation(libs.miglayout.swing)
}

