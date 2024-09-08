description = "TR-Prefs-UI"

plugins {
    id("java-library")
}

dependencies {
    api(libs.netbeans.openide.modules.options.api)

    implementation(project(":au.com.trgtd.tr.appl"))
    implementation(libs.miglayout.swing)
}

