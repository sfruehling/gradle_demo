
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
//    imageName = "gradledemo"
    builder = "gcr.io/paketo-buildpacks/builder:latest"
}

tasks.bootJar {
//    archiveBaseName.set("apoplan")
//    archiveVersion.set("1.0.0")
    launchScript()
}

