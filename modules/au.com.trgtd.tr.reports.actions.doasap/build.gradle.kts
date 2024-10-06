description = "TR-Reports-Actions-DoASAP"

plugins {
    id("java-library")
}

dependencies {
    api(project(":au.com.trgtd.tr.extract"))

    implementation(project(":au.com.trgtd.tr.appl"))
    implementation(project(":au.com.trgtd.tr.resource"))
    implementation(project(":au.com.trgtd.tr.swing"))
    implementation(project(":tr.extract.reports"))
    implementation(project(":tr.model"))

    implementation(libs.itext)
    implementation(libs.jasperreports)
}
