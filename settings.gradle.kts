plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

rootProject.name = "ThinkingRock"

val auTrProjects = listOf("appl", "calendar", "calendar.ical4j", "datastore", "prefs.actions", "prefs.dates", "prefs.projects", "prefs.recurrence", "resource", "swing", "util", "runtime").map { "au.com.trgtd.tr.$it" }

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
