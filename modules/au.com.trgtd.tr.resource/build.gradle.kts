description = "TR-Resource"

plugins {
    id("java-library")
}

dependencies {
    implementation(libs.netbeans.openide.filesystems)
    implementation(libs.netbeans.openide.util.ui)
}

