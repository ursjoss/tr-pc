plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

rootProject.name = "ThinkingRock"

val trProjects = listOf("appl", "calendar", "calendar.ical4j", "prefs.actions", "prefs.dates", "prefs.projects", "prefs.recurrence", "resource", "swing", "util", "runtime")

fun trPackage(projects: List<String>) = projects.map { "au.com.trgtd.tr.$it" }

include(trPackage(trProjects))

defineProjectPaths()

fun defineProjectPaths() {
    mapOf(
        "modules" to trPackage(trProjects),
    ).forEach { (subDir, projects) ->
        projects.forEach { projectName ->
             project(":$projectName").projectDir = file("$subDir/$projectName")
        }
    }
}
