description = "TR-Resource"

plugins {
    id("java-library")
}

dependencies {
    implementation(libs.netbeans.api.openide.filesystems)
    implementation(libs.netbeans.api.openide.util.ui)
}

