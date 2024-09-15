description = "TR-View"

plugins {
    id("java-library")
}

dependencies {
    implementation(project(":au.com.trgtd.tr.appl"))
    implementation(project(":au.com.trgtd.tr.prefs.actions"))
    implementation(project(":au.com.trgtd.tr.prefs.dates"))
    implementation(project(":au.com.trgtd.tr.prefs.ui"))
    implementation(project(":au.com.trgtd.tr.resource"))
    implementation(project(":au.com.trgtd.tr.runtime"))
    implementation(project(":au.com.trgtd.tr.services"))
    implementation(project(":au.com.trgtd.tr.swing"))
    implementation(project(":tr.model"))

    implementation(libs.apache.commons.text)
    implementation(libs.swingx)
}

