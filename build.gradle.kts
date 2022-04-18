plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
  //  testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
   // testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    implementation("org.testng:testng:7.4.0")
}

tasks.getByName<Test>("test") {
   // useJUnitPlatform()
    useTestNG()
}