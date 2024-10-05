description = "TR-View-Goals"

plugins {
    id("java-library")
}

dependencies {
    implementation(project(":au.com.trgtd.tr.prefs.projects"))
    implementation(project(":au.com.trgtd.tr.view"))
    implementation(project(":au.com.trgtd.tr.view.project"))
    implementation(project(":au.com.trgtd.tr.view.topics"))
}
