description = "TR-Cal"

plugins {
    id("java-library")
}

dependencies {
    implementation(project(":au.com.trgtd.tr.appl"))
    implementation(project(":au.com.trgtd.tr.prefs.dates"))
    implementation(project(":au.com.trgtd.tr.services"))
    implementation(project(":tr.model"))

    implementation(libs.miglayout.swing)
}
