plugins {
    `kotlin-dsl`
}

dependencies {
    implementation (gradlePlugin("org.springframework.boot:2.6.3"))
    implementation(gradlePlugin("org.sonarqube:3.3"))
}

fun gradlePlugin(plugin: String): String = plugin.let {
    val (id, version) = it.split(":", limit = 2)
    "$id:$id.gradle.plugin:$version"
}
