description = "TR-View-Contexts"

plugins {
    id("java-library")
}

dependencies {
    implementation(project(":au.com.trgtd.tr.view"))
    implementation(libs.glazedlists)
    implementation(libs.netbeans.api.layout)
}

