description = "TR-Task-Messages"

plugins {
    id("java-library")
}

dependencies {
    implementation(project(":au.com.trgtd.tr.appl"))
    implementation(project(":au.com.trgtd.tr.runtime"))
    implementation(project(":au.com.trgtd.tr.util"))
}
