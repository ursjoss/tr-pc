description = "TR-Archive"

plugins {
    id("java-library")
}

dependencies {
    api(libs.netbeans.openide.util)

    implementation(project(":au.com.trgtd.tr.appl"))
    implementation(project(":au.com.trgtd.tr.resource"))
    implementation(project(":au.com.trgtd.tr.datastore.xstream"))
    implementation(project(":au.com.trgtd.tr.swing"))
    implementation(project(":tr.model"))

    implementation(libs.netbeans.api.jdesktop.layout)
    implementation(libs.netbeans.api.openide.awt)
}

