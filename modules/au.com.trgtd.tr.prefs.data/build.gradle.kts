description = "TR-Prefs-Data"

plugins {
    id("java-library")
}

dependencies {
    api(libs.netbeans.openide.modules.options.api)

    implementation(project(":au.com.trgtd.tr.appl"))
    implementation(project(":au.com.trgtd.tr.swing"))
    implementation(project(":au.com.trgtd.tr.util"))

    implementation(libs.netbeans.openide.util)
    implementation(libs.netbeans.openide.windows)
    implementation(libs.miglayout.swing)
}

