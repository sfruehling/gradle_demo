plugins {
    id("java")
}

tasks.test {
    useJUnitPlatform()
    filter {
        includeTestsMatching("**Test")
    }

    testLogging.events("passed", "skipped", "failed")
}

tasks.register<Test>("itest") {
    useJUnitPlatform()

    filter {
        includeTestsMatching("*IT*")
        setFailOnNoMatchingTests(false)
    }

    testLogging.events("passed", "skipped", "failed")
}

