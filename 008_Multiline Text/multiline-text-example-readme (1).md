# Android Multiline Text Input Example

This project demonstrates how to implement a multiline text input field in an Android application using Kotlin.

## Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/multilineexample/
│   │   │   └── MainActivity.kt
│   │   ├── res/
│   │   │   └── layout/
│   │   │       └── activity_main.xml
│   │   └── AndroidManifest.xml
│   └── build.gradle
└── build.gradle
```

## Features

- Multiline text input field using TextInputLayout and TextInputEditText
- Real-time character count display
- Maximum character limit with visual indicator
- Basic validation (non-empty check)
- Submit button to demonstrate form submission
- Display of input text and validation result

## Setup

1. Clone this repository or download the source files.
2. Open the project in Android Studio.
3. Run the app on an emulator or physical device.

## Code Overview

### MainActivity.kt

This file contains the main logic for handling user input and validating the multiline text.

Key points:
- Uses TextInputEditText for multiline text input
- Implements a TextWatcher for real-time character count
- Enforces a maximum character limit
- Implements basic validation (non-empty check)
- Displays input text and validation result on button click

### activity_main.xml

This layout file defines the UI of the app, including:
- TextInputLayout with TextInputEditText for multiline text input
- TextView for displaying character count
- A submit button
- A TextView for displaying validation results

### AndroidManifest.xml

This file declares the main activity and sets up basic app properties.

## Notes

- This example uses a character limit of 500, which can be easily adjusted in both the Kotlin code and XML layout.
- Consider adding more sophisticated validation or text processing based on your specific requirements.
- For larger text inputs, you might want to consider saving the state to prevent loss of data on configuration changes.

