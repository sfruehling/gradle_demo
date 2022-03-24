import gradle.kotlin.dsl.accessors._a2b5453e3e3b9109085ee2e220dee1d1.bootBuildImage

plugins {
    application
    id("org.springframework.boot")
}

apply(plugin = "io.spring.dependency-management")

// sollte eigentlich automatisch gefunden werden :-(
springBoot {
    mainClass.set("gradledemo.application.Application")
}

tasks.bootBuildImage {
//    setEnabled(true)
//    imageName = "apoplan"
    builder = "gcr.io/paketo-buildpacks/builder:latest"
}

tasks.bootJar {
//    archiveBaseName.set("apoplan")
//    archiveVersion.set("1.0.0")
    launchScript()
}

