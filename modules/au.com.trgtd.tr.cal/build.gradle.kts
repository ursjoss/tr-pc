description = "TR-Cal"

plugins {
    id("java-library")
}

dependencies {
    api(libs.netbeans.openide.modules.options.api)

    implementation(project(":au.com.trgtd.tr.appl"))
    implementation(project(":au.com.trgtd.tr.prefs.dates"))
    implementation(project(":au.com.trgtd.tr.services"))
}

