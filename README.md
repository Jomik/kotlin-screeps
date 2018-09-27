*DEPRECATED: Use https://github.com/exaV/screeps-kotlin-types/*

# Kotlin types for Screeps API

[ ![Download](https://api.bintray.com/packages/jomik/kotlin-screeps/kotlin-screeps/images/download.svg) ](https://bintray.com/jomik/kotlin-screeps/kotlin-screeps/_latestVersion)

We add two extra types to handle Javascript integration as seen in [Javascript.kt](src/main/kotlin/Javascript.kt).
- `Record`: which gives us a type for an object where the keys are of one type and the values of a type.
- `JsPair`: which gives us a type for an array with 2 elements.

## Installation

```
repositories {
  jcenter()
}

dependencies {
  compile("io.damtoft:kotlin-screeps:0.1.4")
}
```

An example can be seen in [my Screeps AI](https://github.com/Jomik/screeps-ai-kt/blob/master/build.gradle.kts).
