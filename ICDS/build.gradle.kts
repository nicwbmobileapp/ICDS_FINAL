// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.4.1")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

plugins {

        id("com.android.application") version "8.5.1" apply false
        id("com.android.library") version "8.5.1" apply false
        id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}
