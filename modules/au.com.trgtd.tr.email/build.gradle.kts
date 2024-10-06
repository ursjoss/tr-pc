description = "TR-Email"

plugins {
    id("java-library")
}

dependencies {
    implementation(project(":au.com.trgtd.tr.appl"))
    implementation(project(":au.com.trgtd.tr.services"))
    implementation(project(":tr.model"))

    implementation(libs.apache.commons.lang3)
    implementation(libs.javax.mail)
    implementation(libs.miglayout.swing)
}
