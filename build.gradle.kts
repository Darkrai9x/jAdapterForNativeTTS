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
    withType<MavenPublication> {
      pom {
        url.set("https://github.com/jonelo/jAdapterForNativeTTS")
        name.set("jadapter-for-native-tts")
        scm {
          url.set("https://github.com/jonelo/jAdapterForNativeTTS")
        }
      }
    }
  }
}
