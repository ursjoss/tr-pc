description = "TR-Datastore"

plugins {
    id("java-library")
}

dependencies {
    implementation(project(":au.com.trgtd.tr.util"))
    implementation(project(":tr.model"))
    implementation(libs.netbeans.openide.util)
}

