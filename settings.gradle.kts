rootProject.name = "GradleDemo"
println("In the settings.gradle.kts file - This is executable during initialisation phase")
println("In the settings,gradle.kts file - Determine which project take part in the build")
include("App")

plugins {
  id("com.gradle.enterprise") version("3.9")
  }

gradleEnterprise {
  buildScan {
    termsOfServiceUrl = "https://gradle.com/terms-of-service"
    termsOfServiceAgree = "yes"
  }
}
