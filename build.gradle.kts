plugins {
    java
    scala
    `maven-publish`
}

group = "committee.nova"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala-library:2.13.8")
}