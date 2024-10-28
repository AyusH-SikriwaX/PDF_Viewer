pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        jcenter() {
            content {
                includeModule("com.jeroenmols", "myLibrary")
            }
        }


    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        jcenter() {
            content {
                includeModule("com.jeroenmols", "mylibrary")
            }
        }
    }
}

rootProject.name = "PDF Viewer"
include(":app")
