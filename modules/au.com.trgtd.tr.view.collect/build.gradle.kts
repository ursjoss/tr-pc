description = "TR-View-Collect"

plugins {
    id("java-library")
}

dependencies {
    api(libs.netbeans.openide.util)

    implementation(project(":au.com.trgtd.tr.view"))
    implementation(project(":au.com.trgtd.tr.view.topics"))
}

