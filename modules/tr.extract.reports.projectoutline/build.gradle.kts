description = "TR-Extract-Reports-ProjectOutline"

plugins {
    id("java-library")
}

dependencies {
    implementation(project(":au.com.trgtd.tr.extract"))
    implementation(project(":au.com.trgtd.tr.resource"))
    implementation(project(":tr.extract.reports"))
}
