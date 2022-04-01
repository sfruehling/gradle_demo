plugins{
    id("java")
}

dependencies{
    implementation("org.slf4j:slf4j-simple:2.0.0-alpha6")
    compileOnly("org.projectlombok:lombok:1.18.22")
    annotationProcessor("org.projectlombok:lombok:1.18.22")

    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")
    testImplementation("org.mockito:mockito-junit-jupiter:4.2.0")
    testImplementation( "org.hamcrest:hamcrest-all:1.3")
    testImplementation("com.tngtech.archunit:archunit-junit5:0.22.0")
    testCompileOnly("org.projectlombok:lombok:1.18.22")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.22")
}