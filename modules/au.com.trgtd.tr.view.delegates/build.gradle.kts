description = "TR-View-Delegates"

plugins {
    id("java-library")
}

dependencies {
    api(project(":tr.model"))

    implementation(project(":au.com.trgtd.tr.view"))
    implementation(libs.glazedlists)
}
