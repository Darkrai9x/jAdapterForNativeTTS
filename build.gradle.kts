plugins {
  id("java")
  id("maven-publish")
}

group = "io.github.Darkrai9x"
version = "0.12.1"

repositories {
  mavenCentral()
}

publishing {
  publications {
    create<MavenPublication>("mavenJava") {
      groupId = "io.github.Darkrai9x"
      artifactId = "jAdapterForNativeTTS"
      version = "0.12.1"
    }
  }
}
