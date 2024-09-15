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
    //"datastore.xstream2", // broken?
    "email",
    "export",
    "export.actions",
    "export.data",
    "export.references",
    "export.someday",
    "extract",
//    "find",
    //"extract.clean", // broken?
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
    "view",
    "view.contexts",
    "view.criteria",
    "view.project",
    "view.topics",
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
