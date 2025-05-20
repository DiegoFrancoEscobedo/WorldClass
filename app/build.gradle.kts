plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    //
    id("com.google.devtools.ksp")

}

android {
    namespace = "com.example.worldclass"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.worldclass"
        minSdk = 26
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

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.navigation.runtime.android)
    implementation(libs.androidx.benchmark.macro)
    implementation(libs.androidx.datastore.core.android)
    implementation(libs.androidx.adaptive.android)
    implementation(libs.androidx.media3.common.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
    implementation(libs.androidx.compose.material.icons.extended)
    implementation(libs.accompanist.systemuicontroller)
    implementation(libs.androidx.runtime)

    // Coil AsyncImage
    //implementation("io.coil-kt: coil-compose:2.4.0")
    implementation(libs.xcoil.compose)


    // retrofit
//    implementation("com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:1.0.0")
    implementation(libs.retrofit2.kotlinx.serialization.converter)

//    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation(libs.retrofit)

//    implementation("com.squareup.okhttp3:okhttp:4.11.0")
    implementation(libs.okhttp)

//    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0")
    implementation(libs.kotlinx.serialization.json)

//    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation(libs.converter.gson)

//    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
    implementation (libs.androidx.lifecycle.runtime.ktx.v262)

    val room_version = "2.6.1"
    implementation("androidx.room:room-runtime:$room_version")
    implementation("androidx.room:room-ktx:$room_version")
    ksp("androidx.room:room-compiler:$room_version")


    val cameraxVersion = "1.3.1"
    implementation("androidx.camera:camera-core:$cameraxVersion") // Lógica base
    implementation("androidx.camera:camera-camera2:$cameraxVersion")// Conexión con la API Camera2
    implementation("androidx.camera:camera-lifecycle:$cameraxVersion")
    implementation("androidx.camera:camera-view:$cameraxVersion") // Necesario para la prewiew
    implementation("androidx.navigation:navigation-compose:2.7.7")
    implementation ("com.google.accompanist:accompanist-permissions:0.34.0")
    implementation("androidx.camera:camera-video:$cameraxVersion")
    implementation ("io.coil-kt:coil-compose:2.2.2")

    implementation("androidx.work:work-runtime-ktx:2.10.1")
    implementation ("androidx.work:work-runtime:2.10.1")

    implementation ("androidx.biometric:biometric:1.2.0-alpha05")






}