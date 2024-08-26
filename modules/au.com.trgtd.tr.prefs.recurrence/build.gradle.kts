description = "TR-Prefs-Recurrence"

plugins {
    id("java-library")
}

dependencies {
    api(libs.netbeans.openide.modules.options.api)
    api(libs.netbeans.openide.util)

    implementation(project(":au.com.trgtd.tr.appl"))

    implementation(libs.miglayout.swing)
}

