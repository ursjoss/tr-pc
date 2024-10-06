description = "TR-Prefs-Dates"

plugins {
    id("java-library")
}

dependencies {
    implementation(project(":au.com.trgtd.tr.appl"))
    implementation(libs.miglayout.swing)
}
