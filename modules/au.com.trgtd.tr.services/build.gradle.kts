description = "TR-Services"

plugins {
    id("java-library")
}

dependencies {
    implementation(project(":au.com.trgtd.tr.appl"))
    implementation(project(":tr.model"))

    implementation(libs.apache.commons.lang3)
}

