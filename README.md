# My Java Maven Project

This is a simple Java Maven project that demonstrates the basic structure of a Maven application.

## Project Structure

```
my-java-maven-project
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── App.java
│   │   └── resources
│   └── test
│       ├── java
│       └── resources
├── pom.xml
└── README.md
```

## Description

- **App.java**: This is the main class of the application. It contains the `main` method which prints "Hello, World!" to the console.
- **src/main/resources**: This directory is intended for resource files needed by the application.
- **src/test/java**: This directory is for unit tests of the application.
- **src/test/resources**: This directory is for resource files needed for testing.
- **pom.xml**: The Maven configuration file that manages project dependencies and build settings.

## How to Run

1. Ensure you have Maven installed on your machine.
2. Navigate to the project directory.
3. Run the following command to compile and execute the application:

   ```
   mvn clean compile exec:java -Dexec.mainClass="com.example.App"
   ```

## License

This project is licensed under the MIT License.