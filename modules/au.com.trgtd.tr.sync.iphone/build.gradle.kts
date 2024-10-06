description = "TR-Sync-iphone"

plugins {
    id("java-library")
}

dependencies {
    implementation(project(":au.com.trgtd.tr.appl"))
    implementation(project(":au.com.trgtd.tr.datastore"))
    implementation(project(":au.com.trgtd.tr.services"))
    implementation(project(":au.com.trgtd.tr.swing"))
    implementation(project(":tr.model"))

    implementation(libs.miglayout.swing)
}
