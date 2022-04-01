plugins{
    id("gradledemo.javalibrary")
}

dependencies{
    implementation(project(":gradle-demo-domain"))
    implementation("org.springframework.boot:spring-boot-starter-web:2.6.5")

    testImplementation("org.springframework.boot:spring-boot-starter-test:2.6.5")
}

tasks.test {
    useJUnitPlatform()
    testLogging.events("passed", "skipped",
            "failed")
}