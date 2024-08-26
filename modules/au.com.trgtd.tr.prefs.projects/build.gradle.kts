description = "TR-Prefs-Projects"

plugins {
    id("java-library")
}

dependencies {
    implementation(project(":au.com.trgtd.tr.appl"))
    implementation(project(":au.com.trgtd.tr.swing"))

    implementation(libs.netbeans.openide.util)
    implementation(libs.miglayout.swing)
}

