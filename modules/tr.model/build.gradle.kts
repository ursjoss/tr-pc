description = "TR-Model"

plugins {
    id("java-library")
}

dependencies {
    implementation(project(":au.com.trgtd.tr.appl"))
    implementation(project(":au.com.trgtd.tr.prefs.actions"))
    implementation(project(":au.com.trgtd.tr.prefs.dates"))
    implementation(project(":au.com.trgtd.tr.prefs.projects"))
    implementation(project(":au.com.trgtd.tr.prefs.recurrence"))
    implementation(project(":au.com.trgtd.tr.resource"))
    implementation(project(":au.com.trgtd.tr.util"))

    implementation(libs.ical4j)
    implementation(libs.apache.commons.email)
    implementation(libs.apache.commons.lang3)
    implementation(libs.minimaljson)
    implementation(libs.netbeans.api.progress)
    implementation(libs.netbeans.openide.dialogs)
    implementation(libs.netbeans.openide.nodes)
    implementation(libs.netbeans.openide.util)
}

