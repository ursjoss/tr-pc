description = "TR-Datastore"

plugins {
    id("java-library")
}

dependencies {
    api(libs.netbeans.openide.util)
    api(project(":au.com.trgtd.tr.util"))

    implementation(project(":tr.model"))
}

