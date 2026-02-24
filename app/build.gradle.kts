android {
    externalNativeBuild {
         ndkBuild {
             path = file("src/main/jni/Android.mk")
         }
     }
    sourceSets {
        named("main") {
            java.srcDirs("src/main/kotlin")
            jniLibs.srcDirs("libs")
        }
    }
}