description = "TR-Date"

plugins {
    id("java-library")
}

dependencies {
    api(libs.netbeans.openide.modules.options.api)

    implementation(project(":au.com.trgtd.tr.appl"))
    implementation(project(":au.com.trgtd.tr.datastore"))
    implementation(project(":au.com.trgtd.tr.datastore.xstream"))
    implementation(project(":au.com.trgtd.tr.prefs.ui"))
    implementation(project(":au.com.trgtd.tr.resource"))
    implementation(project(":au.com.trgtd.tr.task.activation"))
    implementation(project(":au.com.trgtd.tr.task.recurrence"))

    implementation(libs.netbeans.api.javahelp)
}
