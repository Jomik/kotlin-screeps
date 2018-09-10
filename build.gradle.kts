import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile

plugins {
  id("kotlin2js") version "1.2.61"
  `maven-publish`
  id("com.jfrog.bintray") version "1.8.4"
}

group = "io.damtoft"
version = "0.1.2"

repositories {
  jcenter()
}

dependencies {
  implementation(kotlin("stdlib-js"))
}

val sourcesJar by tasks.creating(Jar::class) {
  classifier = "sources"
  from(sourceSets["main"].allSource)
}

tasks {
  "compileKotlin2Js"(Kotlin2JsCompile::class) {
    kotlinOptions {
      sourceMap = true
      moduleKind = "umd"
    }
  }
}

publishing {
  publications {
    register("mavenJava", MavenPublication::class.java) {
      from(components["java"])
      artifact(sourcesJar)
    }
  }
}

val bintrayUser: String by project
val bintrayKey: String by project

bintray {
  user = bintrayUser
  key = bintrayKey
  setPublications("mavenJava")
  with(pkg) {
    repo = "kotlin-screeps"
    name = "kotlin-screeps"
    websiteUrl = "https://github.com/Jomik/kotlin-screeps"
    vcsUrl = "https://github.com/Jomik/kotlin-screeps"
    githubRepo = "Jomik/kotlin-screeps"
    setLicenses("MIT")
  }
}
