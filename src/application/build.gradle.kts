plugins {
    id("gradledemo.javaapplication")
    id("org.springframework.boot") version "2.6.5"
}

springBoot {
    mainClass.set("gradledemo.application.Application")
}

dependencies{
    implementation(project(":gradle-demo-domain"))
    implementation(project(":gradle-demo-webadapter"))
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf:2.6.5")
    implementation("org.springframework.boot:spring-boot-devtools:2.6.5")
    implementation("org.springframework.boot:spring-boot-starter-actuator:2.6.5")
    implementation("org.springframework.boot:spring-boot-starter-web:2.6.5")

    testImplementation("org.springframework.boot:spring-boot-starter-test:2.6.5")
}
