pluginManagement { repositories { google(); mavenCentral(); gradlePluginPortal() } }
pluginManagement {
repositories {
google()
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

rootProject.name = "AlMahmoudiyaLibrary"
include(":app") {
repositories {
google()
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

rootProject.name = "AlMahmoudiyaLibrary"
include(":app") { repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS); repositories { google(); mavenCentral() } }
rootProject.name = "AlMahmoudiyaLibrary"
include(":app")
