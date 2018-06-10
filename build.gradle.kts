plugins {
    // Apply the java-library plugin to add support for Java Library
    `java-library`
    // Apply the groovy plugin to also add support for Groovy (needed for Spock)
    groovy
}

val micronautVersion = "1.0.0.M1"
val spockVersion = "1.0-groovy-2.4"
val springVersion = "5.0.6.RELEASE"

dependencies {
    annotationProcessor("io.micronaut:inject-java:$micronautVersion")
    runtime("ch.qos.logback:logback-classic:1.2.3")
    // This dependency is exported to consumers, that is to say found on their compile classpath.
    //api("org.apache.commons:commons-math3:3.6.1")
    // This dependency is used internally, and not exposed to consumers on their own compile classpath.
    implementation("org.springframework:spring-context:$springVersion")
    implementation("io.micronaut:runtime:$micronautVersion")
    implementation("io.micronaut:spring:$micronautVersion") {
        exclude(group = "org.springframework")
    }
    //implementation("org.springframework.boot:spring-boot-starter")
    // Use the latest Groovy version for Spock testing
    testImplementation("org.codehaus.groovy:groovy-all:2.4.14")
    // Use the awesome Spock testing and specification framework even with Java
    testImplementation("org.spockframework:spock-core:$spockVersion")
    testImplementation("org.spockframework:spock-spring:$spockVersion") {
        exclude(group = "org.springframework")
    }
    testImplementation("org.springframework:spring-test:$springVersion")
}

repositories {
    jcenter()
    maven {
        setUrl("https://jcenter.bintray.com")
    }
}
