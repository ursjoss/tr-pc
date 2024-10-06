description = "TR-Extract-Reports-ProjectDetail"

plugins {
    id("java-library")
}

dependencies {
    implementation(project(":au.com.trgtd.tr.extract"))
    implementation(project(":au.com.trgtd.tr.resource"))
    implementation(project(":tr.extract.reports"))
}
