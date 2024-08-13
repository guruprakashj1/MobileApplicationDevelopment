# Android Plain Text Input Example

This project demonstrates how to effectively use EditText for plain text input in an Android application using Kotlin. It showcases various features and validations for plain text input fields.

## Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/plaintextexample/
│   │   │   └── MainActivity.kt
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   │   └── activity_main.xml
│   │   │   └── values/
│   │   │       └── strings.xml
│   │   └── AndroidManifest.xml
│   └── build.gradle
└── build.gradle
```

## Features

- Plain text input field with various attributes
- Input field with hint text
- Input field with max length restriction
- Input field with custom input type
- Real-time input validation
- Character counter
- Custom error handling
- Submit button to demonstrate form submission
- Display of input validation results

## Setup

1. Clone this repository or download the source files.
2. Open the project in Android Studio.
3. Run the app on an emulator or physical device.

## Code Overview

### MainActivity.kt

This file contains the main logic for handling user input and validating the plain text fields.

Key points:
- Sets up EditText for plain text input
- Implements input validation and error handling
- Demonstrates how to use TextWatcher for real-time input validation
- Handles form submission and displays results

### activity_main.xml

This layout file defines the UI of the app, including:
- TextInputLayout with EditText for plain text input
- TextView for displaying character count
- A submit button
- A TextView for displaying validation results

### strings.xml

Contains string resources used in the app.

### AndroidManifest.xml

This file declares the main activity and sets up basic app properties.

## Notes

- This example demonstrates basic usage of EditText for plain text input. In a real-world application, you might want to implement more sophisticated validation logic or integrate with a form validation library.
- Consider adding more input fields or customizing the appearance of EditText based on your specific requirements.

