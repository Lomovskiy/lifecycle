plugins {
    alias(libs.plugins.comAndroidApplication)
    alias(libs.plugins.orgJetbrainsKotlinAndroid)
    alias(libs.plugins.orgJetbrainsKotlinPluginCompose)
}

android {
    namespace = "ru.lomovskiy.lifecycle"
    compileSdk = 35

    defaultConfig {
        applicationId = "ru.lomovskiy.lifecycle"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(libs.androidxNavigation.navigationCompose)
    implementation(libs.androidxCore.coreKtx)
    implementation(libs.androidxLifecycle.lifecycleRuntimeKtx)
    implementation(libs.androidxActivity.activityCompose)
    implementation(platform(libs.androidxCompose.composeBom))
    implementation(libs.androidxUi.ui)
    implementation(libs.androidxComposeUi.uiGraphics)
    implementation(libs.androidxComposeUi.uiToolingPreview)
    implementation(libs.androidxComposeMaterial3.material3)
    testImplementation(libs.junit.junit)
    androidTestImplementation(libs.androidxTestExt.junit)
    androidTestImplementation(libs.androidxTestEspresso.espressoCore)
    androidTestImplementation(platform(libs.androidxCompose.composeBom))
    androidTestImplementation(libs.androidxComposeUi.uiTestJunit4)
    debugImplementation(libs.androidxComposeUi.uiTooling)
    debugImplementation(libs.androidxComposeUi.uiTestManifest)
}