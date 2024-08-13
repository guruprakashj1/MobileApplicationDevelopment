# Android Password Fields Example

This project demonstrates how to implement both a regular password field and a numeric password (PIN) field in an Android application using Kotlin.

## Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/passwordexample/
│   │   │   └── MainActivity.kt
│   │   ├── res/
│   │   │   └── layout/
│   │   │       └── activity_main.xml
│   │   └── AndroidManifest.xml
│   └── build.gradle
└── build.gradle
```

## Features

- Regular password field with visibility toggle
- Numeric password (PIN) field limited to 4 digits
- Basic input validation
- Error messaging for invalid input

## Setup

1. Clone this repository or download the source files.
2. Open the project in Android Studio.
3. Run the app on an emulator or physical device.

## Code Overview

### MainActivity.kt

This file contains the main logic for handling user input and validating the password and PIN.

Key points:
- Uses TextInputEditText for password fields
- Implements basic validation logic
- Displays error messages for invalid input

### activity_main.xml

This layout file defines the UI of the app, including:
- Two TextInputLayout widgets for password fields
- A submit button
- A TextView for displaying results

### AndroidManifest.xml

This file declares the main activity and sets up basic app properties.

## Notes

- This is a basic example and does not implement actual authentication.
- In a real-world scenario, you would need to implement secure password handling and storage.
- Always hash and salt passwords before storing them.
- Consider using a dedicated authentication service for production apps.

