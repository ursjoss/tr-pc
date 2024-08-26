description = "TR-Prefs-Actions"

plugins {
    id("java-library")
}

dependencies {
    api(libs.netbeans.openide.modules.options.api)
    api(libs.netbeans.openide.util.ui)

    implementation(project(":au.com.trgtd.tr.appl"))
    implementation(project(":au.com.trgtd.tr.swing"))
    implementation(project(":au.com.trgtd.tr.util"))

    implementation(libs.miglayout.swing)
}

