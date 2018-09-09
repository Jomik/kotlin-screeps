pluginManagement {
  resolutionStrategy {
    eachPlugin {
      if (requested.id.id == "kotlin2js") {
        useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${requested.version}")
      }
    }
  }
}
enableFeaturePreview("STABLE_PUBLISHING")

rootProject.name = "kotlin-screeps"
