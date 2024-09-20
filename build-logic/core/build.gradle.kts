plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(libs.comAndroidToolsBuild.gradle)
    implementation(libs.orgJetbrainsKotlin.kotlinGradlePlugin)
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}