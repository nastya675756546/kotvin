pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Mobilki_Kostin"
include(":pr2")
include(":pr3")
include(":pr4")
include(":pr6")
include(":pr6")
include(":pr5")
include(":pr7")
include(":pr8")
include(":pr9")

include(":pr10")
include(":pr11")
include(":pr12")
include(":pr13")
