plugins {
    java
    application
}

group = "com.github.progterv.builder"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("junit", "junit", "4.13")
}

application {
    mainClassName = "com.github.progterv.builder.Main"
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
