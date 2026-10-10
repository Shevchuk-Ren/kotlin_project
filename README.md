# kotlin_project

kotlinc src/main/kotlin/domain/*.kt src/main/kotlin/Main.kt -include-runtime -d app.jar
kotlinc $(find src/main/kotlin -name "*.kt") -include-runtime -d app.jar
java -jar app.jar