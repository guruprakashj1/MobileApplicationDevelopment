# Android Number Input Examples

This project demonstrates how to implement various types of number input fields in an Android application using Kotlin. It includes examples for regular numbers, signed numbers, and decimal numbers.

## Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/numberinputexample/
│   │   │   └── MainActivity.kt
│   │   ├── res/
│   │   │   └── layout/
│   │   │       └── activity_main.xml
│   │   └── AndroidManifest.xml
│   └── build.gradle
└── build.gradle
```

## Features

- Regular number input field
- Signed number input field (positive and negative numbers)
- Decimal number input field
- Input validation for each field type
- Submit button to demonstrate form submission
- Display of input values and validation results

## Setup

1. Clone this repository or download the source files.
2. Open the project in Android Studio.
3. Run the app on an emulator or physical device.

## Code Overview

### MainActivity.kt

This file contains the main logic for handling different types of number inputs and their validation.

Key points:
- Uses TextInputEditText for each number input type
- Implements input filters and text watchers for proper formatting
- Implements validation for each number type
- Displays input values and validation results on button click

### activity_main.xml

This layout file defines the UI of the app, including:
- TextInputLayout with TextInputEditText for each number input type
- A submit button
- A TextView for displaying validation results

### AndroidManifest.xml

This file declares the main activity and sets up basic app properties.

## Notes

- The regular number input only allows positive integers.
- The signed number input allows both positive and negative integers.
- The decimal number input allows floating-point numbers with up to two decimal places.
- Consider adding more sophisticated validation or number processing based on your specific requirements.

