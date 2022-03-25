plugins {
    id("application")
    id("org.springframework.boot") version "2.6.5"
}

springBoot {
    mainClass.set("gradledemo.application.Application")
}

dependencies{
    implementation(project(":gradle-demo-domain"))
    implementation(project(":gradle-demo-webadapter"))
    implementation("org.slf4j:slf4j-simple:2.0.0-alpha6")
    compileOnly("org.projectlombok:lombok:1.18.22")
    annotationProcessor("org.projectlombok:lombok:1.18.22")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf:2.6.5")
    implementation("org.springframework.boot:spring-boot-devtools:2.6.5")
    implementation("org.springframework.boot:spring-boot-starter-actuator:2.6.5")
    implementation("org.springframework.boot:spring-boot-starter-web:2.6.5")

    testImplementation("org.springframework.boot:spring-boot-starter-test:2.6.5")
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")
    testImplementation("org.mockito:mockito-junit-jupiter:4.2.0")
    testImplementation( "org.hamcrest:hamcrest-all:1.3")
    testImplementation("com.tngtech.archunit:archunit-junit5:0.22.0")
    testCompileOnly("org.projectlombok:lombok:1.18.22")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.22")
}
