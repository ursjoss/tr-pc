description = "TR-Prefs-Projects"

dependencies {
    implementation(project(":au.com.trgtd.tr.appl"))
    implementation(project(":au.com.trgtd.tr.swing"))

    implementation(libs.netbeans.openide.modules.options.api)
    implementation(libs.netbeans.openide.util)
    implementation(libs.miglayout.swing)
}

