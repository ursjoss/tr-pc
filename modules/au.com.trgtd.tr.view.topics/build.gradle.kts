description = "TR-View-Topics"

plugins {
    id("java-library")
}

dependencies {
    implementation(project(":au.com.trgtd.tr.view"))

    implementation(libs.glazedlists)
}
