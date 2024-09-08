description = "TR-Extract"

plugins {
    id("java-library")
}

dependencies {
    implementation(project(":au.com.trgtd.tr.appl"))
    implementation(project(":au.com.trgtd.tr.datastore"))
    implementation(project(":au.com.trgtd.tr.runtime"))
    implementation(project(":au.com.trgtd.tr.swing"))
    implementation(project(":tr.model"))

    implementation(libs.apache.commons.text)
    implementation(libs.fop)
}

