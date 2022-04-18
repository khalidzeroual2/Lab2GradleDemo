/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn more about Gradle by exploring our samples at https://docs.gradle.org/7.4.2/samples
 * This project uses @Incubating APIs which are subject to change.
 */

description = """
    Example Gradle project for Java application
"""


plugins{
    //Apply the application
    application

}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(16))
    }
}

repositories{
    //Uses Maven repository to get the libs
    mavenCentral()
}

dependencies{

    //Specify the TestNG framework
    testImplementation("org.testng:testng:7.4.0")

    //The dependency also uses the google guava library
    implementation("com.google.guava:guava:30.0-jre")

    implementation("com.fasterxml.jackson.core:jackson-databind:2.13.2.2")
}

application{
    //Define the main class for the application
    mainClass.set("UserTest.Java")
}

tasks.test{
    //Use TestNG for unit tests
    useTestNG()
}
