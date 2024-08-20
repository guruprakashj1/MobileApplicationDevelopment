# Android Button Example

This project demonstrates how to effectively use the standard Button component in an Android application using Kotlin. It showcases various button attributes, styles, and click handling methods.

## Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/buttonexample/
│   │   │   └── MainActivity.kt
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   │   └── activity_main.xml
│   │   │   ├── values/
│   │   │   │   ├── strings.xml
│   │   │   │   ├── colors.xml
│   │   │   │   └── styles.xml
│   │   │   └── drawable/
│   │   │       └── custom_button_background.xml
│   │   └── AndroidManifest.xml
│   └── build.gradle
└── build.gradle
```

## Features

- Standard Button with click listener
- Button with custom background
- Button with custom text color and size
- Disabled Button
- Button with long click listener
- Button with custom style

## Setup

1. Clone this repository or download the source files.
2. Open the project in Android Studio.
3. Run the app on an emulator or physical device.

## Code Overview

### MainActivity.kt

This file contains the main logic for handling button clicks and demonstrating various button functionalities.

Key points:
- Sets up click listeners for different buttons
- Demonstrates how to handle both short and long clicks
- Shows how to change button properties programmatically

### activity_main.xml

This layout file defines the UI of the app, including various buttons with different styles and attributes.

### strings.xml, colors.xml, styles.xml

These files contain resources for text, colors, and styles used by the buttons.

### custom_button_background.xml

Defines a custom drawable for button background.

### AndroidManifest.xml

This file declares the main activity and sets up basic app properties.

## Notes

- This example demonstrates various ways to customize and use buttons. In a real-world application, you would typically choose a consistent style for buttons throughout your app.
- Remember to provide appropriate feedback to users when buttons are pressed, especially for operations that may take some time to complete.

