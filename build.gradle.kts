// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.comAndroidApplication) apply false
    alias(libs.plugins.comAndroidLibrary) apply false
    alias(libs.plugins.orgJetbrainsKotlinAndroid) apply false
    alias(libs.plugins.orgJetbrainsKotlinPluginCompose) apply false
    alias(libs.plugins.comGoogleDevtoolsKsp) apply false
    alias(libs.plugins.comGoogleDaggerHiltAndroid) apply false
    id("core")
}