// Gradle script to clean up the stephengold.github.io project

plugins {
    base // to add a "clean" task to the project
}

// Register cleanup tasks:

tasks.named("clean") {
    dependsOn("cleanCache", "cleanSite")
}
tasks.register<Delete>("cleanCache") {
    delete(".jekyll-cache")
}
tasks.register<Delete>("cleanSite") {
    delete("_site")
}
