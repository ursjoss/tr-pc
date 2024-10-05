description = "TR-View-Project"

plugins {
    id("java-library")
}

dependencies {
    api(project(":tr.model"))
    implementation(project(":au.com.trgtd.tr.view"))
    implementation(project(":au.com.trgtd.tr.prefs.projects"))
    implementation(project(":au.com.trgtd.tr.view.topics"))
    implementation(project(":au.com.trgtd.tr.view.criteria"))
}
