description = "TR-Swing"

plugins {
    id("java-library")
}

dependencies {
    api(libs.miglayout.swing)

    implementation(project(":au.com.trgtd.tr.prefs.dates"))
    implementation(project(":au.com.trgtd.tr.util"))

    implementation(libs.netbeans.api.openide.util.ui)
}

