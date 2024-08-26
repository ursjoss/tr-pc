description = "TR-Calendar"

plugins {
    id("java-library")
}

dependencies {
    api(libs.netbeans.openide.modules.options.api)

    implementation(project(":au.com.trgtd.tr.appl"))
    implementation(project(":au.com.trgtd.tr.swing"))

    implementation(libs.miglayout.swing)
}

