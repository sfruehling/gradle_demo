
pluginManagement {
    repositories {
        gradlePluginPortal()
    }
    includeBuild("gradle/gradle-build-logic")
}

dependencyResolutionManagement {
    repositories {
        mavenLocal()
        mavenCentral()
    }
}

rootProject.name = "gradle_demo"

include(":gradle-demo-application")
project(":gradle-demo-application").projectDir = file("src/application")

include(":gradle-demo-domain")
project(":gradle-demo-domain").projectDir = file("src/domain")

include(":gradle-demo-webadapter")
project(":gradle-demo-webadapter").projectDir = file("src/webadapter")
