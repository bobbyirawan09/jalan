package com.jalan.buildsrc

import com.sun.tools.classfile.Dependencies
import org.gradle.api.artifacts.dsl.DependencyHandler

/**
 * Created by Bobby Irawan on 19/12/20.
 */

fun DependencyHandler.commonsDependencies() {
    implementation(LibraryDependencies.COROUTINES_ANDROID)
    implementation(LibraryDependencies.TIMBER)
}
private fun DependencyHandler.implementation(depName: String) {
    add("implementation", depName)
}
private fun DependencyHandler.kapt(depName: String) {
    add("kapt", depName)
}
private fun DependencyHandler.compileOnly(depName: String) {
    add("compileOnly", depName)
}
private fun DependencyHandler.api(depName: String) {
    add("api", depName)
}