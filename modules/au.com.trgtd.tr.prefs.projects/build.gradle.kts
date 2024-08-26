description = "TR-Prefs-Projects"

plugins {
    id("java-library")
}

dependencies {
    api(libs.netbeans.openide.modules.options.api)
    api(libs.netbeans.openide.util)

    implementation(project(":au.com.trgtd.tr.appl"))
    implementation(project(":au.com.trgtd.tr.swing"))

    implementation(libs.miglayout.swing)
}

