plugins {
    id("java")
    id("jacoco")
}

tasks.test {
    finalizedBy(tasks.jacocoTestReport) // report is always generated after tests run
}

tasks.jacocoTestReport {
    dependsOn("test")
    reports {
        xml.required.set(true)
        csv.required.set(false)
        html.required.set(false)
    }
}
