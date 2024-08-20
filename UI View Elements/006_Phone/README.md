# Android Phone Number Input Example

This project demonstrates how to implement and validate a phone number input field in an Android application using Kotlin.

## Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/phoneexample/
│   │   │   └── MainActivity.kt
│   │   ├── res/
│   │   │   └── layout/
│   │   │       └── activity_main.xml
│   │   └── AndroidManifest.xml
│   └── build.gradle
└── build.gradle
```

## Features

- Phone number input field with Material Design
- Real-time phone number formatting
- Basic phone number validation
- Submit button to demonstrate form submission
- Display of validation result

## Setup

1. Clone this repository or download the source files.
2. Open the project in Android Studio.
3. Run the app on an emulator or physical device.

## Code Overview

### MainActivity.kt

This file contains the main logic for handling user input and validating the phone number.

Key points:
- Uses TextInputEditText for phone number input
- Implements real-time phone number formatting using a TextWatcher
- Uses a simple regex for basic phone number validation
- Displays validation result on button click

### activity_main.xml

This layout file defines the UI of the app, including:
- TextInputLayout with TextInputEditText for phone number input
- A submit button
- A TextView for displaying validation results

### AndroidManifest.xml

This file declares the main activity and sets up basic app properties.

## Notes

- This is a basic example of phone number validation and formatting. In a production app, you might want to use a library like libphonenumber for more robust international phone number handling.
- The phone number format used here is for US numbers (XXX-XXX-XXXX). Adjust the formatting and validation logic for your specific requirements.
- Always validate phone numbers on the server-side as well, as client-side validation can be bypassed.

