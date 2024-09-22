description = "TR-Application"

plugins {
    id("java-library")
}

dependencies {
    api(libs.netbeans.modules.options.api)

    implementation(libs.netbeans.openide.modules)
    implementation(libs.netbeans.openide.util)
    implementation(libs.netbeans.openide.util.lookup)
    implementation(libs.netbeans.openide.windows)
    implementation(libs.netbeans.modules.bootstrap)
    implementation(libs.netbeans.modules.projectapi)
    implementation(libs.netbeans.modules.projectapi.nb)
    implementation(libs.netbeans.api.annotations.common)
    implementation(libs.netbeans.modules.core.multitabs.project)
    implementation(libs.netbeans.modules.core.windows)
    implementation(libs.netbeans.modules.javahelp)
    implementation(libs.netbeans.swing.tabcontrol)
    implementation(libs.netbeans.jdesktop.layout)
    implementation(libs.miglayout.swing)
}

