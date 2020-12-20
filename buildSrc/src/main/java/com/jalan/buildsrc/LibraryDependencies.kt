package com.jalan.buildsrc

import com.jalan.buildsrc.Versions.COROUTINE

/**
 * Created by Bobby Irawan on 19/12/20.
 */

private object Versions {
    const val CHUCKER = "3.3.0"
    const val COROUTINE = "1.4.2"
    const val RETROFIT = "2.9.0"
    const val KOTLIN = "1.4.21"
    const val OK_HTTP = "4.7.2"
    const val KOIN = "2.1.6"
    const val LIFECYCLE = "2.2.0"
    const val TIMBER = "4.7.1"
    const val APP_COMPAT = "1.2.0"
    const val CORE = "1.3.2"
    const val CONSTRAINT_LAYOUT = "2.0.4"
    const val RECYCLER_VIEW = "1.1.0"
    const val FRAGMENT = "1.2.5"
    const val MATERIAL = "1.2.1"
    const val COIL = "0.11.0"
    const val GSON = "2.8.6"
    const val LEGACY_SUPPORT = "1.0.0"
}

object LibraryDependencies {

    const val TIMBER = "com.jakewharton.timber:timber:${Versions.TIMBER}"
    const val APP_COMPAT = "androidx.appcompat:appcompat:${Versions.APP_COMPAT}"
    const val CONSTRAINT_LAYOUT =
            "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"
    const val RECYCLER_VIEW = "androidx.recyclerview:recyclerview:${Versions.RECYCLER_VIEW}"
    const val MATERIAL = "com.google.android.material:material:${Versions.MATERIAL}"
    const val COROUTINES_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$COROUTINE"
    const val CORE_KTX = "androidx.core:core-ktx:${Versions.CORE}"
    const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:${Versions.FRAGMENT}"

    const val COIL = "io.coil-kt:coil:${Versions.COIL}"

    const val GSON = "com.google.code.gson:gson:${Versions.GSON}"

    const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
    const val RETROFIT_MOSHI_CONVERTER = "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT}"
    const val OK_HTTP = "com.squareup.okhttp3:okhttp:${Versions.OK_HTTP}"
    const val LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:${Versions.OK_HTTP}"

    const val KOIN = "org.koin:koin-androidx-viewmodel:${Versions.KOIN}"

    const val CHUCKER = "com.github.chuckerteam.chucker:library:${Versions.CHUCKER}"
    const val CHUCKER_NO_OP = "com.github.chuckerteam.chucker:library-no-op:${Versions.CHUCKER}"

    const val LEGACY_SUPPORT = "androidx.legacy:legacy-support-v4:${Versions.LEGACY_SUPPORT}"

    const val LIFECYCLE_VIEWMODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE}"
    const val LIFECYCLE_EXTENSIONS = "androidx.lifecycle:lifecycle-extensions:${Versions.LIFECYCLE}"
    const val LIFECYCLE_LIVEDATA = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.LIFECYCLE}"
    const val LIFECYCLE_PROCESS = "androidx.lifecycle:lifecycle-process:${Versions.LIFECYCLE}"

}