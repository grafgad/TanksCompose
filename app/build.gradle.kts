import com.google.firebase.crashlytics.buildtools.gradle.CrashlyticsExtension
import org.jetbrains.kotlin.konan.properties.Properties

plugins {
    id ("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("kotlin-parcelize")
    id("com.google.gms.google-services")
    id("com.google.firebase.crashlytics")
}

android {
    compileSdk = 33
    namespace = "com.example.tankscompose"

    defaultConfig {
        applicationId = "com.example.tankscompose"
        minSdk = 23
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        onEach {
            val properties = Properties()
            properties.load(project.rootProject.file("apikey.properties").inputStream())
            val appId = properties.getProperty("APPLICATION_ID2", "")
            it.buildConfigField("String", "APPLICATION_ID2", appId)
        }
        debug{
           isMinifyEnabled = false
            (this as ExtensionAware).configure<CrashlyticsExtension> {
                mappingFileUploadEnabled = false
            }
        }
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.0"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    // Core
    implementation("androidx.core:core-ktx:1.9.0")

    // Firebase BoM
    implementation(platform("com.google.firebase:firebase-bom:30.5.0"))
    implementation("com.google.firebase:firebase-analytics-ktx")
    implementation("com.google.firebase:firebase-crashlytics-ktx")
    implementation("com.google.firebase:firebase-config-ktx")

    //Room
//    implementation("androidx.room:room-runtime:2.5.0")
//    implementation("androidx.room:room-ktx:2.5.0")
//    implementation("androidx.core:core-ktx:+")
//    kapt("androidx.room:room-compiler:2.5.0")

    //rxJava
    implementation("io.reactivex.rxjava3:rxandroid:3.0.0")
    implementation("io.reactivex.rxjava3:rxjava:3.1.5")
    implementation("io.reactivex.rxjava3:rxkotlin:3.0.1")
    implementation("com.jakewharton.rxrelay3:rxrelay:3.0.1")

    //Okhttp
    implementation("com.squareup.okhttp3:okhttp:5.0.0-alpha.10")
    implementation("com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.10")

    //retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.retrofit2:adapter-rxjava3:2.9.0")

    //dagger
//    implementation("com.google.dagger:dagger:2.44.2")
//    kapt("com.google.dagger:dagger-compiler:2.44.2")

    //Jetpack Compose
    val composeVersion = "1.3.0-beta01"
    implementation("androidx.activity:activity-compose:1.6.1")
    implementation("androidx.compose.animation:animation:$composeVersion")
    implementation("androidx.compose.foundation:foundation:$composeVersion")
    implementation("androidx.compose.material:material:$composeVersion")
    implementation("androidx.compose.ui:ui:$composeVersion")
    implementation("androidx.compose.ui:ui-tooling:$composeVersion")
    implementation("androidx.navigation:navigation-compose:2.5.3")

    // ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1")

    // View
    implementation("androidx.appcompat:appcompat:1.6.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.android.material:material:1.8.0")

    // Test
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")

    // UI Tests
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.3.3")

    // LeakCanary
    debugImplementation("com.squareup.leakcanary:leakcanary-android:2.9.1")
}