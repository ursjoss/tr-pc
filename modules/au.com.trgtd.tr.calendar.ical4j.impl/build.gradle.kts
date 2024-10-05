description = "TR-Calendar-ical4j-impl"

plugins {
    id("java-library")
}

dependencies {
    implementation(project(":au.com.trgtd.tr.appl"))
    implementation(project(":au.com.trgtd.tr.calendar"))
    implementation(project(":au.com.trgtd.tr.calendar.ical4j"))
    implementation(project(":au.com.trgtd.tr.swing"))
    implementation(project(":tr.model"))
}
