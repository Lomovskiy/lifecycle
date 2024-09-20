plugins {
    alias(libs.plugins.comAndroidLibrary) apply true
    alias(libs.plugins.orgJetbrainsKotlinAndroid) apply true
    alias(libs.plugins.comGoogleDevtoolsKsp) apply true
    alias(libs.plugins.comGoogleDaggerHiltAndroid) apply true
    id("kotlin-kapt")
}

android {
    namespace = "ru.lomovskiy.lifecycle.db"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(libs.androidxRoom.roomRuntime)
    ksp(libs.androidxRoom.roomCompiler)

    implementation(libs.comGoogleDagger.hiltAndroid)
    kapt(libs.comGoogleDagger.hiltCompiler)


    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}