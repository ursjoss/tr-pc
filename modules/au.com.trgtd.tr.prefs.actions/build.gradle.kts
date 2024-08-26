description = "TR-Prefs-Actions"

plugins {
    id("java-library")
}

dependencies {
    implementation(project(":au.com.trgtd.tr.appl"))
    implementation(project(":au.com.trgtd.tr.swing"))
    implementation(project(":au.com.trgtd.tr.util"))

    implementation(libs.netbeans.openide.util.ui)
    implementation(libs.miglayout.swing)
}

