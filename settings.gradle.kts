rootProject.name="Gradle Demo"

dependencyResolutionManagement{
    repositories {
        mavenLocal()
        mavenCentral()
    }
}

include(":gradle-demo-application")
include(":gradle-demo-domain")
include(":gradle-demo-webadapter")

project(":gradle-demo-application").projectDir = file("src/application")
project(":gradle-demo-domain").projectDir = file("src/domain")
project(":gradle-demo-webadapter").projectDir = file("src/webadapter")