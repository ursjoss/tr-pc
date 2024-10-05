description = "TR-View-Filters"

plugins {
    id("java-library")
}

dependencies {
    api(libs.swingx)

    implementation(project(":tr.model"))
    implementation(project(":au.com.trgtd.tr.appl"))
    implementation(project(":au.com.trgtd.tr.swing"))
}
