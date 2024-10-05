description = "TR-Export-Someday"

plugins {
    id("java-library")
}

dependencies {
    implementation(project(":au.com.trgtd.tr.appl"))
    implementation(project(":au.com.trgtd.tr.export"))
    implementation(project(":au.com.trgtd.tr.extract"))
    implementation(project(":au.com.trgtd.tr.resource"))
    implementation(project(":tr.model"))
}
