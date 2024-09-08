plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

rootProject.name = "ThinkingRock"

val auTrProjects = listOf(
    "appl",
    "archive",
    "cal",
    "calendar",
    "calendar.ical4j",
    "calendar.ical4j.impl",
    "data",
    "data.recent",
    "datastore",
    "datastore.xstream",
    "email",
    "export",
    "extract",
    "prefs.actions",
    "prefs.data",
    "prefs.dates",
    "prefs.projects",
    "prefs.recurrence",
    "prefs.ui",
    "resource",
    "swing",
    "task.activation",
    "task.recurrence",
    "util",
    "runtime",
    "services",
).map { "au.com.trgtd.tr.$it" }

val trProjects = listOf("model").map { "tr.$it" }

include(auTrProjects)
include(trProjects)

defineProjectPaths()

fun defineProjectPaths() {
    setOf(
        auTrProjects,
        trProjects,
    ).forEach { projects ->
        projects.forEach { projectName ->
             project(":$projectName").projectDir = file("modules/$projectName")
        }
    }
}
